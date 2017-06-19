/*
 * Secure Data Space API
 * Version 4.1.2 - built at: 2017-03-02 18:50:25, API server: https://sds.ssp-europe.eu/api/v4
 *
 * OpenAPI spec version: 4.1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.api;

import ch.cyberduck.core.sds.io.swagger.client.ApiException;
import ch.cyberduck.core.sds.io.swagger.client.model.GroupIds;
import ch.cyberduck.core.sds.io.swagger.client.model.RoleGroupList;
import ch.cyberduck.core.sds.io.swagger.client.model.RoleList;
import ch.cyberduck.core.sds.io.swagger.client.model.RoleUserList;
import ch.cyberduck.core.sds.io.swagger.client.model.UserIds;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RolesApi
 */
@Ignore
public class RolesApiTest {

    private final RolesApi api = new RolesApi();

    
    /**
     * Add groups to the role
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br /&gt;Adds one or more groups to a role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Groups Role Grant\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; One or more groups will be added to a role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRoleGroupsTest() throws ApiException {
        String xSdsAuthToken = null;
        Integer roleId = null;
        GroupIds body = null;
        RoleGroupList response = api.addRoleGroups(xSdsAuthToken, roleId, body);

        // TODO: test validations
    }
    
    /**
     * Add users to the role
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br /&gt;Adds one or more users to a role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Role Grant\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; One or more users will be added to a role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRoleUsersTest() throws ApiException {
        String xSdsAuthToken = null;
        Integer roleId = null;
        UserIds body = null;
        RoleUserList response = api.addRoleUsers(xSdsAuthToken, roleId, body);

        // TODO: test validations
    }
    
    /**
     * Revoke groups role
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br /&gt;Removes one or more groups from a role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Role \&quot;Group Manager\&quot; required. For each role, at least one non-expiring user must remain who keeps the role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; One or more groups will be removed from a role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRoleGroupsTest() throws ApiException {
        String xSdsAuthToken = null;
        Integer roleId = null;
        GroupIds body = null;
        RoleGroupList response = api.deleteRoleGroups(xSdsAuthToken, roleId, body);

        // TODO: test validations
    }
    
    /**
     * Revoke users role
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt;&lt;br /&gt;Removes one or more users from a role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Role \&quot;User Manager\&quot; required. For each role, at least one non-expiring user must remain who keeps the role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; One or more users will be removed from a role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRoleUsersTest() throws ApiException {
        String xSdsAuthToken = null;
        Integer roleId = null;
        UserIds body = null;
        RoleUserList response = api.deleteRoleUsers(xSdsAuthToken, roleId, body);

        // TODO: test validations
    }
    
    /**
     * Get role groups
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br /&gt;Get all groups of a role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Groups Read\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;isMember&lt;/dt&gt;&lt;dd&gt;Filter the groups which are/aren&#39;t member of that role&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false|any]. Default value is &lt;code&gt;true&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;name&lt;/dt&gt;&lt;dd&gt;Group name&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (Group name contains value. Multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;Example: &lt;samp&gt;isMember:eq:false|name:cn:searchstring&lt;/samp&gt;&lt;br/&gt;- get all groups that are not a member of that role and whose name contains searchstring&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRoleGroupsTest() throws ApiException {
        String xSdsAuthToken = null;
        Integer roleId = null;
        Integer offset = null;
        Integer limit = null;
        String filter = null;
        RoleGroupList response = api.getRoleGroups(xSdsAuthToken, roleId, offset, limit, filter);

        // TODO: test validations
    }
    
    /**
     * Get role users
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br /&gt; Get all users of a role.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Read\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;&lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;h4&gt;Filter&lt;/h4&gt;&lt;h5&gt;Filter fields:&lt;/h5&gt;&lt;dl&gt;&lt;dt&gt;isMember&lt;/dt&gt;&lt;dd&gt;Filter the users which are/aren&#39;t member of that role&lt;br/&gt;OPERATOR: &lt;code&gt;eq&lt;/code&gt; (multiple values not allowed)&lt;br/&gt;VALUE: [true|false|any]. Default value is &lt;code&gt;true&lt;/code&gt;&lt;/dd&gt;&lt;dt&gt;displayName&lt;/dt&gt;&lt;dd&gt;User display name (firstName, lastName, login)&lt;br/&gt;OPERATOR: &lt;code&gt;cn&lt;/code&gt; (User display name contains value. Multiple values not allowed)&lt;br/&gt;VALUE: &lt;code&gt;Search string&lt;/code&gt;&lt;/dd&gt;&lt;/dl&gt;Example: &lt;samp&gt;isMember:eq:false|name:cn:searchstring&lt;/samp&gt;&lt;br/&gt;- get all users that are not member of that role and whose display name contains searchstring&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRoleUsersTest() throws ApiException {
        String xSdsAuthToken = null;
        Integer roleId = null;
        Integer offset = null;
        Integer limit = null;
        String filter = null;
        RoleUserList response = api.getRoleUsers(xSdsAuthToken, roleId, offset, limit, filter);

        // TODO: test validations
    }
    
    /**
     * Get all roles and to the role assignment rights
     *
     * &lt;div class&#x3D;\&quot;sds\&quot;&gt;&lt;p&gt;&lt;strong&gt;Functional Description:&lt;/strong&gt; &lt;br /&gt;Retrieve a list of all Roles and the role assignment rights.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Precondition:&lt;/strong&gt; Right \&quot;Users Read\&quot; required.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Effects:&lt;/strong&gt; None.&lt;/p&gt;&lt;p&gt;&lt;strong&gt;Further Information:&lt;/strong&gt; None.&lt;/p&gt;&lt;/div&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRolesTest() throws ApiException {
        String xSdsAuthToken = null;
        RoleList response = api.getRoles(xSdsAuthToken);

        // TODO: test validations
    }
    
}