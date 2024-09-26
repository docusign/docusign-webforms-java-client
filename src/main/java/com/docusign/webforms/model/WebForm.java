package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.WebFormContent;
import com.docusign.webforms.model.WebFormMetadata;
import com.docusign.webforms.model.WebFormProperties;
import com.docusign.webforms.model.WebFormState;
import com.docusign.webforms.model.WebFormSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * An object that fully describes an instance of a form.
 *
 */
@Schema(description = "An object that fully describes an instance of a form")

public class WebForm extends WebFormSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("versionId")
  private Integer versionId = null;

  @JsonProperty("formContent")
  private WebFormContent formContent = null;


  /**
   * versionId.
   *
   * @return WebForm
   **/
  public WebForm versionId(Integer versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Get versionId.
   * @return versionId
   **/
  @Schema(description = "")
  public Integer getVersionId() {
    return versionId;
  }

  /**
   * setVersionId.
   **/
  public void setVersionId(Integer versionId) {
    this.versionId = versionId;
  }


  /**
   * formContent.
   *
   * @return WebForm
   **/
  public WebForm formContent(WebFormContent formContent) {
    this.formContent = formContent;
    return this;
  }

  /**
   * Get formContent.
   * @return formContent
   **/
  @Schema(description = "")
  public WebFormContent getFormContent() {
    return formContent;
  }

  /**
   * setFormContent.
   **/
  public void setFormContent(WebFormContent formContent) {
    this.formContent = formContent;
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
    WebForm webForm = (WebForm) o;
    return Objects.equals(this.versionId, webForm.versionId) &&
        Objects.equals(this.formContent, webForm.formContent) &&
        super.equals(o);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(versionId, formContent, super.hashCode());
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebForm {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    formContent: ").append(toIndentedString(formContent)).append("\n");
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

