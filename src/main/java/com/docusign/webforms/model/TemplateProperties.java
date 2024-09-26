package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Information about a DocuSign template that will be used to seed a web form..
 *
 */
@Schema(description = "Information about a DocuSign template that will be used to seed a web form.")

public class TemplateProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("originalTemplateId")
  private String originalTemplateId = null;

  @JsonProperty("clonedTemplateId")
  private String clonedTemplateId = null;

  @JsonProperty("importedDateTime")
  private String importedDateTime = null;

  @JsonProperty("recipientIds")
  private java.util.List<String> recipientIds = null;


  /**
   * originalTemplateId.
   *
   * @return TemplateProperties
   **/
  public TemplateProperties originalTemplateId(String originalTemplateId) {
    this.originalTemplateId = originalTemplateId;
    return this;
  }

  /**
   * Template identifier for original Template that is used by the DocuSign Template API..
   * @return originalTemplateId
   **/
  @Schema(description = "Template identifier for original Template that is used by the DocuSign Template API.")
  public String getOriginalTemplateId() {
    return originalTemplateId;
  }

  /**
   * setOriginalTemplateId.
   **/
  public void setOriginalTemplateId(String originalTemplateId) {
    this.originalTemplateId = originalTemplateId;
  }


  /**
   * clonedTemplateId.
   *
   * @return TemplateProperties
   **/
  public TemplateProperties clonedTemplateId(String clonedTemplateId) {
    this.clonedTemplateId = clonedTemplateId;
    return this;
  }

  /**
   * Template identifier for cloned Template that is used by the DocuSign Template API..
   * @return clonedTemplateId
   **/
  @Schema(description = "Template identifier for cloned Template that is used by the DocuSign Template API.")
  public String getClonedTemplateId() {
    return clonedTemplateId;
  }

  /**
   * setClonedTemplateId.
   **/
  public void setClonedTemplateId(String clonedTemplateId) {
    this.clonedTemplateId = clonedTemplateId;
  }


  /**
   * importedDateTime.
   *
   * @return TemplateProperties
   **/
  public TemplateProperties importedDateTime(String importedDateTime) {
    this.importedDateTime = importedDateTime;
    return this;
  }

  /**
   * Track the time of assignment of Template information to the Form..
   * @return importedDateTime
   **/
  @Schema(description = "Track the time of assignment of Template information to the Form.")
  public String getImportedDateTime() {
    return importedDateTime;
  }

  /**
   * setImportedDateTime.
   **/
  public void setImportedDateTime(String importedDateTime) {
    this.importedDateTime = importedDateTime;
  }


  /**
   * recipientIds.
   *
   * @return TemplateProperties
   **/
  public TemplateProperties recipientIds(java.util.List<String> recipientIds) {
    this.recipientIds = recipientIds;
    return this;
  }
  
  /**
   * addRecipientIdsItem.
   *
   * @return TemplateProperties
   **/
  public TemplateProperties addRecipientIdsItem(String recipientIdsItem) {
    if (this.recipientIds == null) {
      this.recipientIds = new java.util.ArrayList<>();
    }
    this.recipientIds.add(recipientIdsItem);
    return this;
  }

  /**
   * Track mapped recipients on Template..
   * @return recipientIds
   **/
  @Schema(description = "Track mapped recipients on Template.")
  public java.util.List<String> getRecipientIds() {
    return recipientIds;
  }

  /**
   * setRecipientIds.
   **/
  public void setRecipientIds(java.util.List<String> recipientIds) {
    this.recipientIds = recipientIds;
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
    TemplateProperties templateProperties = (TemplateProperties) o;
    return Objects.equals(this.originalTemplateId, templateProperties.originalTemplateId) &&
        Objects.equals(this.clonedTemplateId, templateProperties.clonedTemplateId) &&
        Objects.equals(this.importedDateTime, templateProperties.importedDateTime) &&
        Objects.equals(this.recipientIds, templateProperties.recipientIds);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(originalTemplateId, clonedTemplateId, importedDateTime, recipientIds);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateProperties {\n");
    
    sb.append("    originalTemplateId: ").append(toIndentedString(originalTemplateId)).append("\n");
    sb.append("    clonedTemplateId: ").append(toIndentedString(clonedTemplateId)).append("\n");
    sb.append("    importedDateTime: ").append(toIndentedString(importedDateTime)).append("\n");
    sb.append("    recipientIds: ").append(toIndentedString(recipientIds)).append("\n");
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

