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
import ch.cyberduck.core.sds.io.swagger.client.model.RoleList;
import ch.cyberduck.core.sds.io.swagger.client.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.joda.time.DateTime;
/**
 * Group information
 */
@Schema(description = "Group information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-15T09:21:49.036118+02:00[Europe/Zurich]")
public class Group {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("createdAt")
  private DateTime createdAt = null;

  @JsonProperty("createdBy")
  private UserInfo createdBy = null;

  @JsonProperty("cntUsers")
  private Integer cntUsers = null;

  @JsonProperty("updatedAt")
  private DateTime updatedAt = null;

  @JsonProperty("updatedBy")
  private UserInfo updatedBy = null;

  @JsonProperty("expireAt")
  private DateTime expireAt = null;

  @JsonProperty("groupRoles")
  private RoleList groupRoles = null;

  public Group id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the group
   * @return id
  **/
  @Schema(required = true, description = "Unique identifier for the group")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Group name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Group name
   * @return name
  **/
  @Schema(required = true, description = "Group name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Group createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date
   * @return createdAt
  **/
  @Schema(required = true, description = "Creation date")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Group createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(required = true, description = "")
  public UserInfo getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserInfo createdBy) {
    this.createdBy = createdBy;
  }

  public Group cntUsers(Integer cntUsers) {
    this.cntUsers = cntUsers;
    return this;
  }

   /**
   * Amount of users
   * @return cntUsers
  **/
  @Schema(required = true, description = "Amount of users")
  public Integer getCntUsers() {
    return cntUsers;
  }

  public void setCntUsers(Integer cntUsers) {
    this.cntUsers = cntUsers;
  }

  public Group updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Modification date
   * @return updatedAt
  **/
  @Schema(description = "Modification date")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Group updatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @Schema(description = "")
  public UserInfo getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Group expireAt(DateTime expireAt) {
    this.expireAt = expireAt;
    return this;
  }

   /**
   * Expiration date
   * @return expireAt
  **/
  @Schema(description = "Expiration date")
  public DateTime getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(DateTime expireAt) {
    this.expireAt = expireAt;
  }

  public Group groupRoles(RoleList groupRoles) {
    this.groupRoles = groupRoles;
    return this;
  }

   /**
   * Get groupRoles
   * @return groupRoles
  **/
  @Schema(description = "")
  public RoleList getGroupRoles() {
    return groupRoles;
  }

  public void setGroupRoles(RoleList groupRoles) {
    this.groupRoles = groupRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.id, group.id) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.createdAt, group.createdAt) &&
        Objects.equals(this.createdBy, group.createdBy) &&
        Objects.equals(this.cntUsers, group.cntUsers) &&
        Objects.equals(this.updatedAt, group.updatedAt) &&
        Objects.equals(this.updatedBy, group.updatedBy) &&
        Objects.equals(this.expireAt, group.expireAt) &&
        Objects.equals(this.groupRoles, group.groupRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, createdBy, cntUsers, updatedAt, updatedBy, expireAt, groupRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    cntUsers: ").append(toIndentedString(cntUsers)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    groupRoles: ").append(toIndentedString(groupRoles)).append("\n");
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
