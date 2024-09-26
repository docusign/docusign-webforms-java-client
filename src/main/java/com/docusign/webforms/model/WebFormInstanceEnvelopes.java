package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * WebFormInstanceEnvelopes.
 *
 */

public class WebFormInstanceEnvelopes implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;


  /**
   * id.
   *
   * @return WebFormInstanceEnvelopes
   **/
  public WebFormInstanceEnvelopes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(String id) {
    this.id = id;
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
    WebFormInstanceEnvelopes webFormInstanceEnvelopes = (WebFormInstanceEnvelopes) o;
    return Objects.equals(this.id, webFormInstanceEnvelopes.id);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormInstanceEnvelopes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

