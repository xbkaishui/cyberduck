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
import ch.cyberduck.core.sds.io.swagger.client.model.KeyValueEntry;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * List of key-value pairs
 */
@Schema(description = "List of key-value pairs")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-15T09:21:49.036118+02:00[Europe/Zurich]")
public class ConfigOptionList {
  @JsonProperty("items")
  private List<KeyValueEntry> items = new ArrayList<>();

  public ConfigOptionList items(List<KeyValueEntry> items) {
    this.items = items;
    return this;
  }

  public ConfigOptionList addItemsItem(KeyValueEntry itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of key-value pairs
   * @return items
  **/
  @Schema(required = true, description = "List of key-value pairs")
  public List<KeyValueEntry> getItems() {
    return items;
  }

  public void setItems(List<KeyValueEntry> items) {
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
    ConfigOptionList configOptionList = (ConfigOptionList) o;
    return Objects.equals(this.items, configOptionList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigOptionList {\n");
    
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
