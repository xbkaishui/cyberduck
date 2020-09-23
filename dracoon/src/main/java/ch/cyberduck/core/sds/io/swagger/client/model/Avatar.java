/*
 * DRACOON API
 * REST Web Services for DRACOON<br>built at: 2020-09-09 08:12:59<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.23.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * User avatar information
 */
@Schema(description = "User avatar information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-15T09:21:49.036118+02:00[Europe/Zurich]")
public class Avatar {
  @JsonProperty("avatarUri")
  private String avatarUri = null;

  @JsonProperty("avatarUuid")
  private String avatarUuid = null;

  @JsonProperty("isCustomAvatar")
  private Boolean isCustomAvatar = null;

  public Avatar avatarUri(String avatarUri) {
    this.avatarUri = avatarUri;
    return this;
  }

   /**
   * Avatar URI
   * @return avatarUri
  **/
  @Schema(required = true, description = "Avatar URI")
  public String getAvatarUri() {
    return avatarUri;
  }

  public void setAvatarUri(String avatarUri) {
    this.avatarUri = avatarUri;
  }

  public Avatar avatarUuid(String avatarUuid) {
    this.avatarUuid = avatarUuid;
    return this;
  }

   /**
   * Avatar UUID
   * @return avatarUuid
  **/
  @Schema(required = true, description = "Avatar UUID")
  public String getAvatarUuid() {
    return avatarUuid;
  }

  public void setAvatarUuid(String avatarUuid) {
    this.avatarUuid = avatarUuid;
  }

  public Avatar isCustomAvatar(Boolean isCustomAvatar) {
    this.isCustomAvatar = isCustomAvatar;
    return this;
  }

   /**
   * Determines whether user updated his / her avatar with own image
   * @return isCustomAvatar
  **/
  @Schema(required = true, description = "Determines whether user updated his / her avatar with own image")
  public Boolean isIsCustomAvatar() {
    return isCustomAvatar;
  }

  public void setIsCustomAvatar(Boolean isCustomAvatar) {
    this.isCustomAvatar = isCustomAvatar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Avatar avatar = (Avatar) o;
    return Objects.equals(this.avatarUri, avatar.avatarUri) &&
        Objects.equals(this.avatarUuid, avatar.avatarUuid) &&
        Objects.equals(this.isCustomAvatar, avatar.isCustomAvatar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUri, avatarUuid, isCustomAvatar);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Avatar {\n");
    
    sb.append("    avatarUri: ").append(toIndentedString(avatarUri)).append("\n");
    sb.append("    avatarUuid: ").append(toIndentedString(avatarUuid)).append("\n");
    sb.append("    isCustomAvatar: ").append(toIndentedString(isCustomAvatar)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
