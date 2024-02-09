package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.WebFormUserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Web Form Instance metadata containing information like created by, created time, etc..
 *
 */
@Schema(description = "Web Form Instance metadata containing information like created by, created time, etc.")

public class WebFormInstanceMetadata {
  @JsonProperty("expirationDateTime")
  private String expirationDateTime = null;

  @JsonProperty("createdDateTime")
  private String createdDateTime = null;

  @JsonProperty("createdBy")
  private WebFormUserInfo createdBy = null;

  @JsonProperty("lastModifiedDateTime")
  private String lastModifiedDateTime = null;

  @JsonProperty("lastModifiedBy")
  private WebFormUserInfo lastModifiedBy = null;


  /**
   * expirationDateTime.
   *
   * @return WebFormInstanceMetadata
   **/
  public WebFormInstanceMetadata expirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

  /**
   * Get expirationDateTime.
   * @return expirationDateTime
   **/
  @Schema(required = true, description = "")
  public String getExpirationDateTime() {
    return expirationDateTime;
  }

  /**
   * setExpirationDateTime.
   **/
  public void setExpirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }


  /**
   * createdDateTime.
   *
   * @return WebFormInstanceMetadata
   **/
  public WebFormInstanceMetadata createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

  /**
   * Get createdDateTime.
   * @return createdDateTime
   **/
  @Schema(required = true, description = "")
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
   * createdBy.
   *
   * @return WebFormInstanceMetadata
   **/
  public WebFormInstanceMetadata createdBy(WebFormUserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The user that created the Web Form Instance.
   * @return createdBy
   **/
  @Schema(required = true, description = "The user that created the Web Form Instance")
  public WebFormUserInfo getCreatedBy() {
    return createdBy;
  }

  /**
   * setCreatedBy.
   **/
  public void setCreatedBy(WebFormUserInfo createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * lastModifiedDateTime.
   *
   * @return WebFormInstanceMetadata
   **/
  public WebFormInstanceMetadata lastModifiedDateTime(String lastModifiedDateTime) {
    this.lastModifiedDateTime = lastModifiedDateTime;
    return this;
  }

  /**
   * Get lastModifiedDateTime.
   * @return lastModifiedDateTime
   **/
  @Schema(description = "")
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
   * lastModifiedBy.
   *
   * @return WebFormInstanceMetadata
   **/
  public WebFormInstanceMetadata lastModifiedBy(WebFormUserInfo lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * The user that last modified the Web Form Instance.
   * @return lastModifiedBy
   **/
  @Schema(description = "The user that last modified the Web Form Instance")
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
    WebFormInstanceMetadata webFormInstanceMetadata = (WebFormInstanceMetadata) o;
    return Objects.equals(this.expirationDateTime, webFormInstanceMetadata.expirationDateTime) &&
        Objects.equals(this.createdDateTime, webFormInstanceMetadata.createdDateTime) &&
        Objects.equals(this.createdBy, webFormInstanceMetadata.createdBy) &&
        Objects.equals(this.lastModifiedDateTime, webFormInstanceMetadata.lastModifiedDateTime) &&
        Objects.equals(this.lastModifiedBy, webFormInstanceMetadata.lastModifiedBy);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(expirationDateTime, createdDateTime, createdBy, lastModifiedDateTime, lastModifiedBy);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormInstanceMetadata {\n");
    
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
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

