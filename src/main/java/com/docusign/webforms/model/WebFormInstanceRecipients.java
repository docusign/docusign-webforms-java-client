package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.InstanceRecipientStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * WebFormInstanceRecipients.
 *
 */

public class WebFormInstanceRecipients implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("recipientViewId")
  private String recipientViewId = null;

  @JsonProperty("instanceRecipientStatus")
  private InstanceRecipientStatus instanceRecipientStatus = null;

  @JsonProperty("roleName")
  private String roleName = null;


  /**
   * recipientViewId.
   *
   * @return WebFormInstanceRecipients
   **/
  public WebFormInstanceRecipients recipientViewId(String recipientViewId) {
    this.recipientViewId = recipientViewId;
    return this;
  }

  /**
   * Get recipientViewId.
   * @return recipientViewId
   **/
  @Schema(description = "")
  public String getRecipientViewId() {
    return recipientViewId;
  }

  /**
   * setRecipientViewId.
   **/
  public void setRecipientViewId(String recipientViewId) {
    this.recipientViewId = recipientViewId;
  }


  /**
   * instanceRecipientStatus.
   *
   * @return WebFormInstanceRecipients
   **/
  public WebFormInstanceRecipients instanceRecipientStatus(InstanceRecipientStatus instanceRecipientStatus) {
    this.instanceRecipientStatus = instanceRecipientStatus;
    return this;
  }

  /**
   * Get instanceRecipientStatus.
   * @return instanceRecipientStatus
   **/
  @Schema(description = "")
  public InstanceRecipientStatus getInstanceRecipientStatus() {
    return instanceRecipientStatus;
  }

  /**
   * setInstanceRecipientStatus.
   **/
  public void setInstanceRecipientStatus(InstanceRecipientStatus instanceRecipientStatus) {
    this.instanceRecipientStatus = instanceRecipientStatus;
  }


  /**
   * roleName.
   *
   * @return WebFormInstanceRecipients
   **/
  public WebFormInstanceRecipients roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName.
   * @return roleName
   **/
  @Schema(description = "")
  public String getRoleName() {
    return roleName;
  }

  /**
   * setRoleName.
   **/
  public void setRoleName(String roleName) {
    this.roleName = roleName;
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
    WebFormInstanceRecipients webFormInstanceRecipients = (WebFormInstanceRecipients) o;
    return Objects.equals(this.recipientViewId, webFormInstanceRecipients.recipientViewId) &&
        Objects.equals(this.instanceRecipientStatus, webFormInstanceRecipients.instanceRecipientStatus) &&
        Objects.equals(this.roleName, webFormInstanceRecipients.roleName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(recipientViewId, instanceRecipientStatus, roleName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormInstanceRecipients {\n");
    
    sb.append("    recipientViewId: ").append(toIndentedString(recipientViewId)).append("\n");
    sb.append("    instanceRecipientStatus: ").append(toIndentedString(instanceRecipientStatus)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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

