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
import ch.cyberduck.core.sds.io.swagger.client.model.Range;
import ch.cyberduck.core.sds.io.swagger.client.model.UserItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * List of users
 */
@Schema(description = "List of users")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-15T09:21:49.036118+02:00[Europe/Zurich]")
public class UserList {
  @JsonProperty("range")
  private Range range = null;

  @JsonProperty("items")
  private List<UserItem> items = new ArrayList<>();

  public UserList range(Range range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @Schema(required = true, description = "")
  public Range getRange() {
    return range;
  }

  public void setRange(Range range) {
    this.range = range;
  }

  public UserList items(List<UserItem> items) {
    this.items = items;
    return this;
  }

  public UserList addItemsItem(UserItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of users
   * @return items
  **/
  @Schema(required = true, description = "List of users")
  public List<UserItem> getItems() {
    return items;
  }

  public void setItems(List<UserItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserList userList = (UserList) o;
    return Objects.equals(this.range, userList.range) &&
        Objects.equals(this.items, userList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserList {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
