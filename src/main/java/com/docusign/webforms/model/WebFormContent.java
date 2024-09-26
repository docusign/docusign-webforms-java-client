package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.TemplateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Container for the components map used during configuration and data collection.
 *
 */
@Schema(description = "Container for the components map used during configuration and data collection")

public class WebFormContent implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("components")
  private java.util.Map<String, java.util.Map<String, Object>> components = null;

  @JsonProperty("isStandalone")
  private Boolean isStandalone = null;

  @JsonProperty("brandId")
  private String brandId = null;

  @JsonProperty("templates")
  private java.util.List<TemplateProperties> templates = null;


  /**
   * components.
   *
   * @return WebFormContent
   **/
  public WebFormContent components(java.util.Map<String, java.util.Map<String, Object>> components) {
    this.components = components;
    return this;
  }

  /**
   * putComponentsItem.
   *
   * @return WebFormContent
   **/
  public WebFormContent putComponentsItem(String key, java.util.Map<String, Object> componentsItem) {
    if (this.components == null) {
      this.components = new java.util.HashMap<>();
    }
    this.components.put(key, componentsItem);
    return this;
  }

  /**
   * Key/value dictionary of components that represent the form.
   * @return components
   **/
  @Schema(example = "{\"Root_Of_Journey\":{\"componentKey\":\"Root_Of_Journey\",\"componentType\":\"Root\",\"children\":[\"Step_abc123\"]},\"TextBox_ABC123\":{\"componentKey\":\"TextBox_ABC123\",\"componentType\":\"TextBox\",\"componentName\":\"Full_Name\",\"label\":\"Full Name\",\"maxLength\":100,\"multiLine\":false,\"placeholder\":\"John Adams\",\"required\":true},\"Step_abc123\":{\"componentKey\":\"Step_abc123\",\"componentType\":\"Step\",\"componentName\":\"Step_abc123\",\"text\":\"Patient Demographics\"}}", description = "Key/value dictionary of components that represent the form")
  public java.util.Map<String, java.util.Map<String, Object>> getComponents() {
    return components;
  }

  /**
   * setComponents.
   **/
  public void setComponents(java.util.Map<String, java.util.Map<String, Object>> components) {
    this.components = components;
  }


  /**
   * isStandalone.
   *
   * @return WebFormContent
   **/
  public WebFormContent isStandalone(Boolean isStandalone) {
    this.isStandalone = isStandalone;
    return this;
  }

  /**
   * Get isStandalone.
   * @return isStandalone
   **/
  @Schema(description = "")
  public Boolean getIsStandalone() {
    return isStandalone;
  }

  /**
   * setIsStandalone.
   **/
  public void setIsStandalone(Boolean isStandalone) {
    this.isStandalone = isStandalone;
  }


  /**
   * brandId.
   *
   * @return WebFormContent
   **/
  public WebFormContent brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId.
   * @return brandId
   **/
  @Schema(description = "")
  public String getBrandId() {
    return brandId;
  }

  /**
   * setBrandId.
   **/
  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  /**
   * templates.
   *
   * @return WebFormContent
   **/
  public WebFormContent templates(java.util.List<TemplateProperties> templates) {
    this.templates = templates;
    return this;
  }
  
  /**
   * addTemplatesItem.
   *
   * @return WebFormContent
   **/
  public WebFormContent addTemplatesItem(TemplateProperties templatesItem) {
    if (this.templates == null) {
      this.templates = new java.util.ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * Optional template information that will be used to seed the form..
   * @return templates
   **/
  @Schema(description = "Optional template information that will be used to seed the form.")
  public java.util.List<TemplateProperties> getTemplates() {
    return templates;
  }

  /**
   * setTemplates.
   **/
  public void setTemplates(java.util.List<TemplateProperties> templates) {
    this.templates = templates;
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
    WebFormContent webFormContent = (WebFormContent) o;
    return Objects.equals(this.components, webFormContent.components) &&
        Objects.equals(this.isStandalone, webFormContent.isStandalone) &&
        Objects.equals(this.brandId, webFormContent.brandId) &&
        Objects.equals(this.templates, webFormContent.templates);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(components, isStandalone, brandId, templates);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormContent {\n");
    
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    isStandalone: ").append(toIndentedString(isStandalone)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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

