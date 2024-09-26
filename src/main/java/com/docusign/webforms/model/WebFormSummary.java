package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.WebFormMetadata;
import com.docusign.webforms.model.WebFormProperties;
import com.docusign.webforms.model.WebFormState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * An object that summarizes an instance of a form that can be used to display a listing.
 *
 */
@Schema(description = "An object that summarizes an instance of a form that can be used to display a listing")

public class WebFormSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("isPublished")
  private Boolean isPublished = null;

  @JsonProperty("isEnabled")
  private Boolean isEnabled = null;

  @JsonProperty("isUploaded")
  private Boolean isUploaded = null;

  @JsonProperty("hasDraftChanges")
  private Boolean hasDraftChanges = null;

  @JsonProperty("formState")
  private WebFormState formState = null;

  @JsonProperty("formProperties")
  private WebFormProperties formProperties = null;

  @JsonProperty("formMetadata")
  private WebFormMetadata formMetadata = null;


  /**
   * id.
   *
   * @return WebFormSummary
   **/
  public WebFormSummary id(String id) {
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
   * accountId.
   *
   * @return WebFormSummary
   **/
  public WebFormSummary accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   * @return accountId
   **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * isPublished.
   *
   * @return WebFormSummary
   **/
  public WebFormSummary isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

  /**
   * Has the form been published.
   * @return isPublished
   **/
  @Schema(example = "true", description = "Has the form been published")
  public Boolean isIsPublished() {
    return isPublished;
  }

  /**
   * setIsPublished.
   **/
  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }


  /**
   * isEnabled.
   *
   * @return WebFormSummary
   **/
  public WebFormSummary isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Is the form currently enabled and available for data collection.
   * @return isEnabled
   **/
  @Schema(example = "true", description = "Is the form currently enabled and available for data collection")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  /**
   * setIsEnabled.
   **/
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  /**
   * isUploaded.
   *
   * @return WebFormSummary
   **/
  public WebFormSummary isUploaded(Boolean isUploaded) {
    this.isUploaded = isUploaded;
    return this;
  }

  /**
   * Has the form created through upload.
   * @return isUploaded
   **/
  @Schema(example = "true", description = "Has the form created through upload")
  public Boolean isIsUploaded() {
    return isUploaded;
  }

  /**
   * setIsUploaded.
   **/
  public void setIsUploaded(Boolean isUploaded) {
    this.isUploaded = isUploaded;
  }


  /**
   * hasDraftChanges.
   *
   * @return WebFormSummary
   **/
  public WebFormSummary hasDraftChanges(Boolean hasDraftChanges) {
    this.hasDraftChanges = hasDraftChanges;
    return this;
  }

  /**
   * Does the form have draft changes that need to be published?.
   * @return hasDraftChanges
   **/
  @Schema(example = "true", description = "Does the form have draft changes that need to be published?")
  public Boolean isHasDraftChanges() {
    return hasDraftChanges;
  }

  /**
   * setHasDraftChanges.
   **/
  public void setHasDraftChanges(Boolean hasDraftChanges) {
    this.hasDraftChanges = hasDraftChanges;
  }


  /**
   * formState.
   *
   * @return WebFormSummary
   **/
  public WebFormSummary formState(WebFormState formState) {
    this.formState = formState;
    return this;
  }

  /**
   * Get formState.
   * @return formState
   **/
  @Schema(description = "")
  public WebFormState getFormState() {
    return formState;
  }

  /**
   * setFormState.
   **/
  public void setFormState(WebFormState formState) {
    this.formState = formState;
  }


  /**
   * formProperties.
   *
   * @return WebFormSummary
   **/
  public WebFormSummary formProperties(WebFormProperties formProperties) {
    this.formProperties = formProperties;
    return this;
  }

  /**
   * Get formProperties.
   * @return formProperties
   **/
  @Schema(description = "")
  public WebFormProperties getFormProperties() {
    return formProperties;
  }

  /**
   * setFormProperties.
   **/
  public void setFormProperties(WebFormProperties formProperties) {
    this.formProperties = formProperties;
  }


  /**
   * formMetadata.
   *
   * @return WebFormSummary
   **/
  public WebFormSummary formMetadata(WebFormMetadata formMetadata) {
    this.formMetadata = formMetadata;
    return this;
  }

  /**
   * Get formMetadata.
   * @return formMetadata
   **/
  @Schema(description = "")
  public WebFormMetadata getFormMetadata() {
    return formMetadata;
  }

  /**
   * setFormMetadata.
   **/
  public void setFormMetadata(WebFormMetadata formMetadata) {
    this.formMetadata = formMetadata;
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
    WebFormSummary webFormSummary = (WebFormSummary) o;
    return Objects.equals(this.id, webFormSummary.id) &&
        Objects.equals(this.accountId, webFormSummary.accountId) &&
        Objects.equals(this.isPublished, webFormSummary.isPublished) &&
        Objects.equals(this.isEnabled, webFormSummary.isEnabled) &&
        Objects.equals(this.isUploaded, webFormSummary.isUploaded) &&
        Objects.equals(this.hasDraftChanges, webFormSummary.hasDraftChanges) &&
        Objects.equals(this.formState, webFormSummary.formState) &&
        Objects.equals(this.formProperties, webFormSummary.formProperties) &&
        Objects.equals(this.formMetadata, webFormSummary.formMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, isPublished, isEnabled, isUploaded, hasDraftChanges, formState, formProperties, formMetadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isUploaded: ").append(toIndentedString(isUploaded)).append("\n");
    sb.append("    hasDraftChanges: ").append(toIndentedString(hasDraftChanges)).append("\n");
    sb.append("    formState: ").append(toIndentedString(formState)).append("\n");
    sb.append("    formProperties: ").append(toIndentedString(formProperties)).append("\n");
    sb.append("    formMetadata: ").append(toIndentedString(formMetadata)).append("\n");
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

