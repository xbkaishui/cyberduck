/*
 * DRACOON
 * Version 4.4.0 - built at: 2017-12-04 04:14:43, API server: https://demo.dracoon.com/api/v4
 *
 * OpenAPI spec version: 4.4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ConfigRoomRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class ConfigRoomRequest {
  @JsonProperty("hasRecycleBin")
  private Boolean hasRecycleBin = null;

  @JsonProperty("recycleBinRetentionPeriod")
  private Integer recycleBinRetentionPeriod = null;

  @JsonProperty("inheritPermissions")
  private Boolean inheritPermissions = null;

  @JsonProperty("takeOverPermissions")
  private Boolean takeOverPermissions = null;

  @JsonProperty("adminIds")
  private List<Long> adminIds = null;

  @JsonProperty("adminGroupIds")
  private List<Long> adminGroupIds = null;

  @JsonProperty("newGroupMemberAcceptance")
  private String newGroupMemberAcceptance = null;

  public ConfigRoomRequest hasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
    return this;
  }

   /**
   * Activate Recycle Bin
   * @return hasRecycleBin
  **/
  @ApiModelProperty(value = "Activate Recycle Bin")
  public Boolean getHasRecycleBin() {
    return hasRecycleBin;
  }

  public void setHasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
  }

  public ConfigRoomRequest recycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
    return this;
  }

   /**
   * Retention period for deleted nodes in days. Integer between 0 and 9999
   * @return recycleBinRetentionPeriod
  **/
  @ApiModelProperty(value = "Retention period for deleted nodes in days. Integer between 0 and 9999")
  public Integer getRecycleBinRetentionPeriod() {
    return recycleBinRetentionPeriod;
  }

  public void setRecycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
  }

  public ConfigRoomRequest inheritPermissions(Boolean inheritPermissions) {
    this.inheritPermissions = inheritPermissions;
    return this;
  }

   /**
   * Inherit permissions from parent room.
   * @return inheritPermissions
  **/
  @ApiModelProperty(value = "Inherit permissions from parent room.")
  public Boolean getInheritPermissions() {
    return inheritPermissions;
  }

  public void setInheritPermissions(Boolean inheritPermissions) {
    this.inheritPermissions = inheritPermissions;
  }

  public ConfigRoomRequest takeOverPermissions(Boolean takeOverPermissions) {
    this.takeOverPermissions = takeOverPermissions;
    return this;
  }

   /**
   * Take over existing permissions
   * @return takeOverPermissions
  **/
  @ApiModelProperty(value = "Take over existing permissions")
  public Boolean getTakeOverPermissions() {
    return takeOverPermissions;
  }

  public void setTakeOverPermissions(Boolean takeOverPermissions) {
    this.takeOverPermissions = takeOverPermissions;
  }

  public ConfigRoomRequest adminIds(List<Long> adminIds) {
    this.adminIds = adminIds;
    return this;
  }

  public ConfigRoomRequest addAdminIdsItem(Long adminIdsItem) {
    if (this.adminIds == null) {
      this.adminIds = new ArrayList<Long>();
    }
    this.adminIds.add(adminIdsItem);
    return this;
  }

   /**
   * List of user Ids. A room requires at least one admin (user or group)
   * @return adminIds
  **/
  @ApiModelProperty(value = "List of user Ids. A room requires at least one admin (user or group)")
  public List<Long> getAdminIds() {
    return adminIds;
  }

  public void setAdminIds(List<Long> adminIds) {
    this.adminIds = adminIds;
  }

  public ConfigRoomRequest adminGroupIds(List<Long> adminGroupIds) {
    this.adminGroupIds = adminGroupIds;
    return this;
  }

  public ConfigRoomRequest addAdminGroupIdsItem(Long adminGroupIdsItem) {
    if (this.adminGroupIds == null) {
      this.adminGroupIds = new ArrayList<Long>();
    }
    this.adminGroupIds.add(adminGroupIdsItem);
    return this;
  }

   /**
   * List of user Ids. A room requires at least one admin (user or group)
   * @return adminGroupIds
  **/
  @ApiModelProperty(value = "List of user Ids. A room requires at least one admin (user or group)")
  public List<Long> getAdminGroupIds() {
    return adminGroupIds;
  }

  public void setAdminGroupIds(List<Long> adminGroupIds) {
    this.adminGroupIds = adminGroupIds;
  }

  public ConfigRoomRequest newGroupMemberAcceptance(String newGroupMemberAcceptance) {
    this.newGroupMemberAcceptance = newGroupMemberAcceptance;
    return this;
  }

   /**
   * autoallow|pending; default:autoallow. Only relevant if adminGroupIds has items
   * @return newGroupMemberAcceptance
  **/
  @ApiModelProperty(value = "autoallow|pending; default:autoallow. Only relevant if adminGroupIds has items")
  public String getNewGroupMemberAcceptance() {
    return newGroupMemberAcceptance;
  }

  public void setNewGroupMemberAcceptance(String newGroupMemberAcceptance) {
    this.newGroupMemberAcceptance = newGroupMemberAcceptance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigRoomRequest configRoomRequest = (ConfigRoomRequest) o;
    return Objects.equals(this.hasRecycleBin, configRoomRequest.hasRecycleBin) &&
        Objects.equals(this.recycleBinRetentionPeriod, configRoomRequest.recycleBinRetentionPeriod) &&
        Objects.equals(this.inheritPermissions, configRoomRequest.inheritPermissions) &&
        Objects.equals(this.takeOverPermissions, configRoomRequest.takeOverPermissions) &&
        Objects.equals(this.adminIds, configRoomRequest.adminIds) &&
        Objects.equals(this.adminGroupIds, configRoomRequest.adminGroupIds) &&
        Objects.equals(this.newGroupMemberAcceptance, configRoomRequest.newGroupMemberAcceptance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasRecycleBin, recycleBinRetentionPeriod, inheritPermissions, takeOverPermissions, adminIds, adminGroupIds, newGroupMemberAcceptance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigRoomRequest {\n");
    
    sb.append("    hasRecycleBin: ").append(toIndentedString(hasRecycleBin)).append("\n");
    sb.append("    recycleBinRetentionPeriod: ").append(toIndentedString(recycleBinRetentionPeriod)).append("\n");
    sb.append("    inheritPermissions: ").append(toIndentedString(inheritPermissions)).append("\n");
    sb.append("    takeOverPermissions: ").append(toIndentedString(takeOverPermissions)).append("\n");
    sb.append("    adminIds: ").append(toIndentedString(adminIds)).append("\n");
    sb.append("    adminGroupIds: ").append(toIndentedString(adminGroupIds)).append("\n");
    sb.append("    newGroupMemberAcceptance: ").append(toIndentedString(newGroupMemberAcceptance)).append("\n");
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
