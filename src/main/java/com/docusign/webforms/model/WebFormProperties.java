package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * General information about the web form that is consistent across versions.
 *
 */
@Schema(description = "General information about the web form that is consistent across versions")

public class WebFormProperties {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isPrivateAccess")
  private Boolean isPrivateAccess = null;


  /**
   * name.
   *
   * @return WebFormProperties
   **/
  public WebFormProperties name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * isPrivateAccess.
   *
   * @return WebFormProperties
   **/
  public WebFormProperties isPrivateAccess(Boolean isPrivateAccess) {
    this.isPrivateAccess = isPrivateAccess;
    return this;
  }

  /**
   * Get isPrivateAccess.
   * @return isPrivateAccess
   **/
  @Schema(description = "")
  public Boolean getIsPrivateAccess() {
    return isPrivateAccess;
  }

  /**
   * setIsPrivateAccess.
   **/
  public void setIsPrivateAccess(Boolean isPrivateAccess) {
    this.isPrivateAccess = isPrivateAccess;
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
    WebFormProperties webFormProperties = (WebFormProperties) o;
    return Objects.equals(this.name, webFormProperties.name) &&
        Objects.equals(this.isPrivateAccess, webFormProperties.isPrivateAccess);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, isPrivateAccess);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isPrivateAccess: ").append(toIndentedString(isPrivateAccess)).append("\n");
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

