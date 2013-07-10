package ch.cyberduck.core.editor;

/*
 * Copyright (c) 2012 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to:
 * dkocher@cyberduck.ch
 */

import ch.cyberduck.core.Path;
import ch.cyberduck.core.Permission;
import ch.cyberduck.core.Session;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.local.Application;
import ch.cyberduck.core.local.Local;
import ch.cyberduck.core.local.TemporaryFileServiceFactory;
import ch.cyberduck.core.transfer.Transfer;
import ch.cyberduck.core.transfer.TransferAction;
import ch.cyberduck.core.transfer.TransferOptions;
import ch.cyberduck.core.transfer.download.DownloadTransfer;
import ch.cyberduck.core.transfer.upload.UploadTransfer;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.Callable;

/**
 * @version $Id$
 */
public abstract class AbstractEditor implements Editor {
    private static final Logger log = Logger.getLogger(AbstractEditor.class);

    /**
     * The file has been closed in the editor while the upload was in progress
     */
    private boolean closed;

    /**
     * File has changed but not uploaded yet
     */
    private boolean modified;

    /**
     * The edited path
     */
    protected Path edited;

    /**
     * The editor application
     */
    private Application application;

    /**
     * Store checksum of downloaded file to detect modifications
     */
    private String checksum;

    /**
     * Session for transfers
     */
    private Session session;

    public AbstractEditor(final Application application, final Session session, final Path path) {
        this.application = application;
        this.edited = path;
        this.edited.setLocal(TemporaryFileServiceFactory.get().create(session.getHost().getUuid(), edited));
        this.session = session;
    }

    /**
     * @param background Download transfer
     */
    protected abstract void open(Callable<Transfer> background);

    /**
     * @param background Upload transfer
     */
    protected abstract void save(Callable<Transfer> background);

    public Path getEdited() {
        return edited;
    }

    public Application getApplication() {
        return application;
    }

    protected void setClosed(boolean closed) {
        if(log.isDebugEnabled()) {
            log.debug(String.format("Set deferred delete flag for %s", edited.getLocal().getAbsolute()));
        }
        this.closed = closed;
    }

    public boolean isClosed() {
        return closed;
    }

    public boolean isModified() {
        return modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }

    protected void delete() {
        final Local file = edited.getLocal();
        if(log.isDebugEnabled()) {
            log.debug(String.format("Delete edited file %s", file.getAbsolute()));
        }
        file.trash();
    }

    /**
     * @return The transfer action for edited file
     */
    protected TransferAction getAction() {
        return TransferAction.ACTION_OVERWRITE;
    }

    /**
     * Open the file in the parent directory
     */
    @Override
    public void open() {
        final Callable<Transfer> background = new EditBackgroundAction();
        if(log.isDebugEnabled()) {
            log.debug(String.format("Download file for edit %s", edited.getLocal().getAbsolute()));
        }
        this.open(background);
    }

    /**
     * Watch for changes in external editor
     */
    protected abstract void edit() throws IOException;

    /**
     * Upload changes to server if checksum of local file has changed since last edit.
     */
    @Override
    public void save() {
        // If checksum still the same no need for save
        if(checksum.equals(edited.getLocal().attributes().getChecksum())) {
            if(log.isInfoEnabled()) {
                log.info(String.format("File %s not modified with checkum %s", edited.getLocal(), checksum));
            }
        }
        else {
            // Store current checksum
            checksum = edited.getLocal().attributes().getChecksum();
            final Callable<Transfer> background = new SaveBackgroundAction();
            if(log.isDebugEnabled()) {
                log.debug(String.format("Upload changes for %s", edited.getLocal().getAbsolute()));
            }
            this.save(background);
        }
    }

    private final class EditBackgroundAction implements Callable<Transfer> {
        @Override
        public Transfer call() throws BackgroundException {
            // Delete any existing file which might be used by a watch editor already
            final Local local = edited.getLocal();
            local.trash();
            final TransferOptions options = new TransferOptions();
            options.quarantine = false;
            options.open = false;
            final Transfer download = new DownloadTransfer(session, edited) {
                @Override
                public TransferAction action(final boolean resumeRequested, final boolean reloadRequested) {
                    return getAction();
                }
            };
            download.start(null, options);
            if(download.isComplete()) {
                checksum = local.attributes().getChecksum();
                final Permission permissions = local.attributes().getPermission();
                // Update local permissions to make sure the file is readable and writable for editing.
                permissions.getOwnerPermissions()[Permission.READ] = true;
                permissions.getOwnerPermissions()[Permission.WRITE] = true;
                local.writeUnixPermission(permissions);
                // Important, should always be run on the main thread; otherwise applescript crashes
                try {
                    AbstractEditor.this.edit();
                }
                catch(IOException e) {
                    throw new BackgroundException(e.getMessage(), e);
                }
            }
            return download;
        }
    }

    private final class SaveBackgroundAction implements Callable<Transfer> {
        @Override
        public Transfer call() throws BackgroundException {
            final Transfer upload = new UploadTransfer(session, edited) {
                @Override
                public TransferAction action(final boolean resumeRequested, final boolean reloadRequested) {
                    return TransferAction.ACTION_OVERWRITE;
                }
            };
            upload.start(null, new TransferOptions());
            if(upload.isComplete()) {
                if(isClosed()) {
                    delete();
                }
                setModified(false);
            }
            return upload;
        }
    }
}