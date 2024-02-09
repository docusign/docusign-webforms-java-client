package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.WebFormInstance;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A list of web form instance items..
 *
 */
@Schema(description = "A list of web form instance items.")

public class WebFormInstanceList {
  @JsonProperty("items")
  private java.util.List<WebFormInstance> items = null;


  /**
   * items.
   *
   * @return WebFormInstanceList
   **/
  public WebFormInstanceList items(java.util.List<WebFormInstance> items) {
    this.items = items;
    return this;
  }
  
  /**
   * addItemsItem.
   *
   * @return WebFormInstanceList
   **/
  public WebFormInstanceList addItemsItem(WebFormInstance itemsItem) {
    if (this.items == null) {
      this.items = new java.util.ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array of web form instance items..
   * @return items
   **/
  @Schema(description = "Array of web form instance items.")
  public java.util.List<WebFormInstance> getItems() {
    return items;
  }

  /**
   * setItems.
   **/
  public void setItems(java.util.List<WebFormInstance> items) {
    this.items = items;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebFormInstanceList webFormInstanceList = (WebFormInstanceList) o;
    return Objects.equals(this.items, webFormInstanceList.items);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormInstanceList {\n");
    
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

