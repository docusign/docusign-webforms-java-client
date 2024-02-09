package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Each component type contains additional properties.
 *
 */
@Schema(description = "Each component type contains additional properties")

public class WebFormComponent extends java.util.HashMap<String, Object> {
  @JsonProperty("componentKey")
  private String componentKey = null;

  @JsonProperty("componentType")
  private String componentType = null;

  @JsonProperty("componentName")
  private String componentName = null;


  /**
   * componentKey.
   *
   * @return WebFormComponent
   **/
  public WebFormComponent componentKey(String componentKey) {
    this.componentKey = componentKey;
    return this;
  }

  /**
   * Get componentKey.
   * @return componentKey
   **/
  @Schema(required = true, description = "")
  public String getComponentKey() {
    return componentKey;
  }

  /**
   * setComponentKey.
   **/
  public void setComponentKey(String componentKey) {
    this.componentKey = componentKey;
  }


  /**
   * componentType.
   *
   * @return WebFormComponent
   **/
  public WebFormComponent componentType(String componentType) {
    this.componentType = componentType;
    return this;
  }

  /**
   * The type of component this object represents.
   * @return componentType
   **/
  @Schema(example = "Checkbox", required = true, description = "The type of component this object represents")
  public String getComponentType() {
    return componentType;
  }

  /**
   * setComponentType.
   **/
  public void setComponentType(String componentType) {
    this.componentType = componentType;
  }


  /**
   * componentName.
   *
   * @return WebFormComponent
   **/
  public WebFormComponent componentName(String componentName) {
    this.componentName = componentName;
    return this;
  }

  /**
   * Name value that is used for mapping components to external sources.
   * @return componentName
   **/
  @Schema(example = "Country_Code", description = "Name value that is used for mapping components to external sources")
  public String getComponentName() {
    return componentName;
  }

  /**
   * setComponentName.
   **/
  public void setComponentName(String componentName) {
    this.componentName = componentName;
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
    WebFormComponent webFormComponent = (WebFormComponent) o;
    return Objects.equals(this.componentKey, webFormComponent.componentKey) &&
        Objects.equals(this.componentType, webFormComponent.componentType) &&
        Objects.equals(this.componentName, webFormComponent.componentName) &&
        super.equals(o);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(componentKey, componentType, componentName, super.hashCode());
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormComponent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    componentKey: ").append(toIndentedString(componentKey)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
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

