package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.WebFormComponentType;
import com.docusign.webforms.model.WebFormSource;
import com.docusign.webforms.model.WebFormType;
import com.docusign.webforms.model.WebFormUserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Form metadata.
 *
 */
@Schema(description = "Form metadata")

public class WebFormMetadata implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("source")
  private WebFormSource source = null;

  @JsonProperty("type")
  private WebFormType type = null;

  @JsonProperty("sourceFormId")
  private String sourceFormId = null;

  @JsonProperty("owner")
  private WebFormUserInfo owner = null;

  @JsonProperty("sender")
  private WebFormUserInfo sender = null;

  @JsonProperty("lastModifiedBy")
  private WebFormUserInfo lastModifiedBy = null;

  @JsonProperty("formContentModifiedBy")
  private WebFormUserInfo formContentModifiedBy = null;

  @JsonProperty("formPropertiesModifiedBy")
  private WebFormUserInfo formPropertiesModifiedBy = null;

  @JsonProperty("lastPublishedBy")
  private WebFormUserInfo lastPublishedBy = null;

  @JsonProperty("lastEnabledBy")
  private WebFormUserInfo lastEnabledBy = null;

  @JsonProperty("lastDisabledBy")
  private WebFormUserInfo lastDisabledBy = null;

  @JsonProperty("archivedDateTime")
  private String archivedDateTime = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  @JsonProperty("formContentModifiedDateTime")
  private String formContentModifiedDateTime = null;

  @JsonProperty("formPropertiesModifiedDateTime")
  private String formPropertiesModifiedDateTime = null;

  @JsonProperty("lastPublishedDateTime")
  private String lastPublishedDateTime = null;

  @JsonProperty("lastEnabledDateTime")
  private String lastEnabledDateTime = null;

  @JsonProperty("lastDisabledDateTime")
  private String lastDisabledDateTime = null;

  @JsonProperty("lastSenderConsentDateTime")
  private String lastSenderConsentDateTime = null;

  @JsonProperty("publishedSlug")
  private String publishedSlug = null;

  @JsonProperty("publishedComponentNames")
  private java.util.Map<String, WebFormComponentType> publishedComponentNames = null;


  /**
   * source.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata source(WebFormSource source) {
    this.source = source;
    return this;
  }

  /**
   * The source from which the webform is created. Accepted values are [templates, blank, form].
   * @return source
   **/
  @Schema(description = "The source from which the webform is created. Accepted values are [templates, blank, form]")
  public WebFormSource getSource() {
    return source;
  }

  /**
   * setSource.
   **/
  public void setSource(WebFormSource source) {
    this.source = source;
  }


  /**
   * type.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata type(WebFormType type) {
    this.type = type;
    return this;
  }

  /**
   * Represents webform type. Possible values are [standalone, hasEsignTemplate].
   * @return type
   **/
  @Schema(description = "Represents webform type. Possible values are [standalone, hasEsignTemplate]")
  public WebFormType getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(WebFormType type) {
    this.type = type;
  }


  /**
   * sourceFormId.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata sourceFormId(String sourceFormId) {
    this.sourceFormId = sourceFormId;
    return this;
  }

  /**
   * The source form id from which the webform is created..
   * @return sourceFormId
   **/
  @Schema(description = "The source form id from which the webform is created.")
  public String getSourceFormId() {
    return sourceFormId;
  }

  /**
   * setSourceFormId.
   **/
  public void setSourceFormId(String sourceFormId) {
    this.sourceFormId = sourceFormId;
  }


  /**
   * owner.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata owner(WebFormUserInfo owner) {
    this.owner = owner;
    return this;
  }

  /**
   * The user that created the form or has been transferred ownership.
   * @return owner
   **/
  @Schema(description = "The user that created the form or has been transferred ownership")
  public WebFormUserInfo getOwner() {
    return owner;
  }

  /**
   * setOwner.
   **/
  public void setOwner(WebFormUserInfo owner) {
    this.owner = owner;
  }


  /**
   * sender.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata sender(WebFormUserInfo sender) {
    this.sender = sender;
    return this;
  }

  /**
   * The user that has added their consent to the form for sending actions.
   * @return sender
   **/
  @Schema(description = "The user that has added their consent to the form for sending actions")
  public WebFormUserInfo getSender() {
    return sender;
  }

  /**
   * setSender.
   **/
  public void setSender(WebFormUserInfo sender) {
    this.sender = sender;
  }


  /**
   * lastModifiedBy.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata lastModifiedBy(WebFormUserInfo lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Track the user that last modified anything related to the form.
   * @return lastModifiedBy
   **/
  @Schema(description = "Track the user that last modified anything related to the form")
  public WebFormUserInfo getLastModifiedBy() {
    return lastModifiedBy;
  }

  /**
   * setLastModifiedBy.
   **/
  public void setLastModifiedBy(WebFormUserInfo lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  /**
   * formContentModifiedBy.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata formContentModifiedBy(WebFormUserInfo formContentModifiedBy) {
    this.formContentModifiedBy = formContentModifiedBy;
    return this;
  }

  /**
   * Track the user that last modified the form content.
   * @return formContentModifiedBy
   **/
  @Schema(description = "Track the user that last modified the form content")
  public WebFormUserInfo getFormContentModifiedBy() {
    return formContentModifiedBy;
  }

  /**
   * setFormContentModifiedBy.
   **/
  public void setFormContentModifiedBy(WebFormUserInfo formContentModifiedBy) {
    this.formContentModifiedBy = formContentModifiedBy;
  }


  /**
   * formPropertiesModifiedBy.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata formPropertiesModifiedBy(WebFormUserInfo formPropertiesModifiedBy) {
    this.formPropertiesModifiedBy = formPropertiesModifiedBy;
    return this;
  }

  /**
   * Track the user that last modified the form properties.
   * @return formPropertiesModifiedBy
   **/
  @Schema(description = "Track the user that last modified the form properties")
  public WebFormUserInfo getFormPropertiesModifiedBy() {
    return formPropertiesModifiedBy;
  }

  /**
   * setFormPropertiesModifiedBy.
   **/
  public void setFormPropertiesModifiedBy(WebFormUserInfo formPropertiesModifiedBy) {
    this.formPropertiesModifiedBy = formPropertiesModifiedBy;
  }


  /**
   * lastPublishedBy.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata lastPublishedBy(WebFormUserInfo lastPublishedBy) {
    this.lastPublishedBy = lastPublishedBy;
    return this;
  }

  /**
   * Track the user that last published a draft version to active.
   * @return lastPublishedBy
   **/
  @Schema(description = "Track the user that last published a draft version to active")
  public WebFormUserInfo getLastPublishedBy() {
    return lastPublishedBy;
  }

  /**
   * setLastPublishedBy.
   **/
  public void setLastPublishedBy(WebFormUserInfo lastPublishedBy) {
    this.lastPublishedBy = lastPublishedBy;
  }


  /**
   * lastEnabledBy.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata lastEnabledBy(WebFormUserInfo lastEnabledBy) {
    this.lastEnabledBy = lastEnabledBy;
    return this;
  }

  /**
   * Track the user that last unpublished an active version.
   * @return lastEnabledBy
   **/
  @Schema(description = "Track the user that last unpublished an active version")
  public WebFormUserInfo getLastEnabledBy() {
    return lastEnabledBy;
  }

  /**
   * setLastEnabledBy.
   **/
  public void setLastEnabledBy(WebFormUserInfo lastEnabledBy) {
    this.lastEnabledBy = lastEnabledBy;
  }


  /**
   * lastDisabledBy.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata lastDisabledBy(WebFormUserInfo lastDisabledBy) {
    this.lastDisabledBy = lastDisabledBy;
    return this;
  }

  /**
   * Track the user that last unpublished an active version.
   * @return lastDisabledBy
   **/
  @Schema(description = "Track the user that last unpublished an active version")
  public WebFormUserInfo getLastDisabledBy() {
    return lastDisabledBy;
  }

  /**
   * setLastDisabledBy.
   **/
  public void setLastDisabledBy(WebFormUserInfo lastDisabledBy) {
    this.lastDisabledBy = lastDisabledBy;
  }


  /**
   * archivedDateTime.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata archivedDateTime(String archivedDateTime) {
    this.archivedDateTime = archivedDateTime;
    return this;
  }

  /**
   * The last time the web form was archived.
   * @return archivedDateTime
   **/
  @Schema(description = "The last time the web form was archived")
  public String getArchivedDateTime() {
    return archivedDateTime;
  }

  /**
   * setArchivedDateTime.
   **/
  public void setArchivedDateTime(String archivedDateTime) {
    this.archivedDateTime = archivedDateTime;
  }


  /**
   * createdDateTime.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Track the time the web form was created.
   * @return createdDateTime
   **/
  @Schema(description = "Track the time the web form was created")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  /**
   * setCreatedDateTime.
   **/
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }


  /**
   * lastModifiedDateTime.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

  /**
   * The last time anything was modified on the form.
   * @return lastModifiedDateTime
   **/
  @Schema(description = "The last time anything was modified on the form")
  public String getLastModifiedDateTime() {
    return lastModifiedDateTime;
  }

  /**
   * setLastModifiedDateTime.
   **/
  public void setLastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
  }


  /**
   * formContentModifiedDateTime.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata formContentModifiedDateTime(String formContentModifiedDateTime) {
    this.formContentModifiedDateTime = formContentModifiedDateTime;
    return this;
  }

  /**
   * Track the last time web form content changed..
   * @return formContentModifiedDateTime
   **/
  @Schema(description = "Track the last time web form content changed.")
  public String getFormContentModifiedDateTime() {
    return formContentModifiedDateTime;
  }

  /**
   * setFormContentModifiedDateTime.
   **/
  public void setFormContentModifiedDateTime(String formContentModifiedDateTime) {
    this.formContentModifiedDateTime = formContentModifiedDateTime;
  }


  /**
   * formPropertiesModifiedDateTime.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata formPropertiesModifiedDateTime(String formPropertiesModifiedDateTime) {
    this.formPropertiesModifiedDateTime = formPropertiesModifiedDateTime;
    return this;
  }

  /**
   * Track the last time the form properties changed..
   * @return formPropertiesModifiedDateTime
   **/
  @Schema(description = "Track the last time the form properties changed.")
  public String getFormPropertiesModifiedDateTime() {
    return formPropertiesModifiedDateTime;
  }

  /**
   * setFormPropertiesModifiedDateTime.
   **/
  public void setFormPropertiesModifiedDateTime(String formPropertiesModifiedDateTime) {
    this.formPropertiesModifiedDateTime = formPropertiesModifiedDateTime;
  }


  /**
   * lastPublishedDateTime.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata lastPublishedDateTime(String lastPublishedDateTime) {
    this.lastPublishedDateTime = lastPublishedDateTime;
    return this;
  }

  /**
   * Track the last time a draft version was published to active.
   * @return lastPublishedDateTime
   **/
  @Schema(description = "Track the last time a draft version was published to active")
  public String getLastPublishedDateTime() {
    return lastPublishedDateTime;
  }

  /**
   * setLastPublishedDateTime.
   **/
  public void setLastPublishedDateTime(String lastPublishedDateTime) {
    this.lastPublishedDateTime = lastPublishedDateTime;
  }


  /**
   * lastEnabledDateTime.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata lastEnabledDateTime(String lastEnabledDateTime) {
    this.lastEnabledDateTime = lastEnabledDateTime;
    return this;
  }

  /**
   * Track the last time the form was enabled.
   * @return lastEnabledDateTime
   **/
  @Schema(description = "Track the last time the form was enabled")
  public String getLastEnabledDateTime() {
    return lastEnabledDateTime;
  }

  /**
   * setLastEnabledDateTime.
   **/
  public void setLastEnabledDateTime(String lastEnabledDateTime) {
    this.lastEnabledDateTime = lastEnabledDateTime;
  }


  /**
   * lastDisabledDateTime.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata lastDisabledDateTime(String lastDisabledDateTime) {
    this.lastDisabledDateTime = lastDisabledDateTime;
    return this;
  }

  /**
   * Track the last time the form was disabled.
   * @return lastDisabledDateTime
   **/
  @Schema(description = "Track the last time the form was disabled")
  public String getLastDisabledDateTime() {
    return lastDisabledDateTime;
  }

  /**
   * setLastDisabledDateTime.
   **/
  public void setLastDisabledDateTime(String lastDisabledDateTime) {
    this.lastDisabledDateTime = lastDisabledDateTime;
  }


  /**
   * lastSenderConsentDateTime.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata lastSenderConsentDateTime(String lastSenderConsentDateTime) {
    this.lastSenderConsentDateTime = lastSenderConsentDateTime;
    return this;
  }

  /**
   * Track the last time a user added their consent for the form..
   * @return lastSenderConsentDateTime
   **/
  @Schema(description = "Track the last time a user added their consent for the form.")
  public String getLastSenderConsentDateTime() {
    return lastSenderConsentDateTime;
  }

  /**
   * setLastSenderConsentDateTime.
   **/
  public void setLastSenderConsentDateTime(String lastSenderConsentDateTime) {
    this.lastSenderConsentDateTime = lastSenderConsentDateTime;
  }


  /**
   * publishedSlug.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata publishedSlug(String publishedSlug) {
    this.publishedSlug = publishedSlug;
    return this;
  }

  /**
   * The public friendly slug that is used to access the form from the player.
   * @return publishedSlug
   **/
  @Schema(example = "BFS6Zw9QxKnerieBsgRyif", description = "The public friendly slug that is used to access the form from the player")
  public String getPublishedSlug() {
    return publishedSlug;
  }

  /**
   * setPublishedSlug.
   **/
  public void setPublishedSlug(String publishedSlug) {
    this.publishedSlug = publishedSlug;
  }


  /**
   * publishedComponentNames.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata publishedComponentNames(java.util.Map<String, WebFormComponentType> publishedComponentNames) {
    this.publishedComponentNames = publishedComponentNames;
    return this;
  }

  /**
   * putPublishedComponentNamesItem.
   *
   * @return WebFormMetadata
   **/
  public WebFormMetadata putPublishedComponentNamesItem(String key, WebFormComponentType publishedComponentNamesItem) {
    if (this.publishedComponentNames == null) {
      this.publishedComponentNames = new java.util.HashMap<>();
    }
    this.publishedComponentNames.put(key, publishedComponentNamesItem);
    return this;
  }

  /**
   * A dictionary containing the mapping of component names to their respective component types for all the published components..
   * @return publishedComponentNames
   **/
  @Schema(description = "A dictionary containing the mapping of component names to their respective component types for all the published components.")
  public java.util.Map<String, WebFormComponentType> getPublishedComponentNames() {
    return publishedComponentNames;
  }

  /**
   * setPublishedComponentNames.
   **/
  public void setPublishedComponentNames(java.util.Map<String, WebFormComponentType> publishedComponentNames) {
    this.publishedComponentNames = publishedComponentNames;
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
    WebFormMetadata webFormMetadata = (WebFormMetadata) o;
    return Objects.equals(this.source, webFormMetadata.source) &&
        Objects.equals(this.type, webFormMetadata.type) &&
        Objects.equals(this.sourceFormId, webFormMetadata.sourceFormId) &&
        Objects.equals(this.owner, webFormMetadata.owner) &&
        Objects.equals(this.sender, webFormMetadata.sender) &&
        Objects.equals(this.lastModifiedBy, webFormMetadata.lastModifiedBy) &&
        Objects.equals(this.formContentModifiedBy, webFormMetadata.formContentModifiedBy) &&
        Objects.equals(this.formPropertiesModifiedBy, webFormMetadata.formPropertiesModifiedBy) &&
        Objects.equals(this.lastPublishedBy, webFormMetadata.lastPublishedBy) &&
        Objects.equals(this.lastEnabledBy, webFormMetadata.lastEnabledBy) &&
        Objects.equals(this.lastDisabledBy, webFormMetadata.lastDisabledBy) &&
        Objects.equals(this.archivedDateTime, webFormMetadata.archivedDateTime) &&
        Objects.equals(this.createdDateTime, webFormMetadata.createdDateTime) &&
        Objects.equals(this.lastModifiedDateTime, webFormMetadata.lastModifiedDateTime) &&
        Objects.equals(this.formContentModifiedDateTime, webFormMetadata.formContentModifiedDateTime) &&
        Objects.equals(this.formPropertiesModifiedDateTime, webFormMetadata.formPropertiesModifiedDateTime) &&
        Objects.equals(this.lastPublishedDateTime, webFormMetadata.lastPublishedDateTime) &&
        Objects.equals(this.lastEnabledDateTime, webFormMetadata.lastEnabledDateTime) &&
        Objects.equals(this.lastDisabledDateTime, webFormMetadata.lastDisabledDateTime) &&
        Objects.equals(this.lastSenderConsentDateTime, webFormMetadata.lastSenderConsentDateTime) &&
        Objects.equals(this.publishedSlug, webFormMetadata.publishedSlug) &&
        Objects.equals(this.publishedComponentNames, webFormMetadata.publishedComponentNames);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(source, type, sourceFormId, owner, sender, lastModifiedBy, formContentModifiedBy, formPropertiesModifiedBy, lastPublishedBy, lastEnabledBy, lastDisabledBy, archivedDateTime, createdDateTime, lastModifiedDateTime, formContentModifiedDateTime, formPropertiesModifiedDateTime, lastPublishedDateTime, lastEnabledDateTime, lastDisabledDateTime, lastSenderConsentDateTime, publishedSlug, publishedComponentNames);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormMetadata {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceFormId: ").append(toIndentedString(sourceFormId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    formContentModifiedBy: ").append(toIndentedString(formContentModifiedBy)).append("\n");
    sb.append("    formPropertiesModifiedBy: ").append(toIndentedString(formPropertiesModifiedBy)).append("\n");
    sb.append("    lastPublishedBy: ").append(toIndentedString(lastPublishedBy)).append("\n");
    sb.append("    lastEnabledBy: ").append(toIndentedString(lastEnabledBy)).append("\n");
    sb.append("    lastDisabledBy: ").append(toIndentedString(lastDisabledBy)).append("\n");
    sb.append("    archivedDateTime: ").append(toIndentedString(archivedDateTime)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    formContentModifiedDateTime: ").append(toIndentedString(formContentModifiedDateTime)).append("\n");
    sb.append("    formPropertiesModifiedDateTime: ").append(toIndentedString(formPropertiesModifiedDateTime)).append("\n");
    sb.append("    lastPublishedDateTime: ").append(toIndentedString(lastPublishedDateTime)).append("\n");
    sb.append("    lastEnabledDateTime: ").append(toIndentedString(lastEnabledDateTime)).append("\n");
    sb.append("    lastDisabledDateTime: ").append(toIndentedString(lastDisabledDateTime)).append("\n");
    sb.append("    lastSenderConsentDateTime: ").append(toIndentedString(lastSenderConsentDateTime)).append("\n");
    sb.append("    publishedSlug: ").append(toIndentedString(publishedSlug)).append("\n");
    sb.append("    publishedComponentNames: ").append(toIndentedString(publishedComponentNames)).append("\n");
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

