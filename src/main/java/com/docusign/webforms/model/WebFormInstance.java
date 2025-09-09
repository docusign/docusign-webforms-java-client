package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.InstanceStatus;
import com.docusign.webforms.model.WebFormInstanceEnvelopes;
import com.docusign.webforms.model.WebFormInstanceMetadata;
import com.docusign.webforms.model.WebFormInstanceRecipients;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * An object that contains the Web Form Instance required to render it  and its metadata such as created by, created time.
 *
 */
@Schema(description = "An object that contains the Web Form Instance required to render it  and its metadata such as created by, created time")

public class WebFormInstance implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("formUrl")
  private String formUrl = null;

  @JsonProperty("instanceToken")
  private String instanceToken = null;

  @JsonProperty("tokenExpirationDateTime")
  private String tokenExpirationDateTime = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("formId")
  private String formId = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("tags")
  private java.util.List<String> tags = null;

  @JsonProperty("status")
  private InstanceStatus status = null;

  @JsonProperty("envelopes")
  private java.util.List<WebFormInstanceEnvelopes> envelopes = null;

  @JsonProperty("instanceMetadata")
  private WebFormInstanceMetadata instanceMetadata = null;

  @JsonProperty("formValues")
  private java.util.Map<String, Object> formValues = null;

  @JsonProperty("brandId")
  private String brandId = null;

  @JsonProperty("recipients")
  private java.util.List<WebFormInstanceRecipients> recipients = null;


  /**
   * formUrl.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance formUrl(String formUrl) {
    this.formUrl = formUrl;
    return this;
  }

  /**
   * Get formUrl.
   * @return formUrl
   **/
  @Schema(description = "")
  public String getFormUrl() {
    return formUrl;
  }

  /**
   * setFormUrl.
   **/
  public void setFormUrl(String formUrl) {
    this.formUrl = formUrl;
  }


  /**
   * instanceToken.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance instanceToken(String instanceToken) {
    this.instanceToken = instanceToken;
    return this;
  }

  /**
   * Get instanceToken.
   * @return instanceToken
   **/
  @Schema(description = "")
  public String getInstanceToken() {
    return instanceToken;
  }

  /**
   * setInstanceToken.
   **/
  public void setInstanceToken(String instanceToken) {
    this.instanceToken = instanceToken;
  }


  /**
   * tokenExpirationDateTime.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance tokenExpirationDateTime(String tokenExpirationDateTime) {
    this.tokenExpirationDateTime = tokenExpirationDateTime;
    return this;
  }

  /**
   * Get tokenExpirationDateTime.
   * @return tokenExpirationDateTime
   **/
  @Schema(description = "")
  public String getTokenExpirationDateTime() {
    return tokenExpirationDateTime;
  }

  /**
   * setTokenExpirationDateTime.
   **/
  public void setTokenExpirationDateTime(String tokenExpirationDateTime) {
    this.tokenExpirationDateTime = tokenExpirationDateTime;
  }


  /**
   * id.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(required = true, description = "")
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
   * formId.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance formId(String formId) {
    this.formId = formId;
    return this;
  }

  /**
   * Web form from which the instance is created.
   * @return formId
   **/
  @Schema(description = "Web form from which the instance is created")
  public String getFormId() {
    return formId;
  }

  /**
   * setFormId.
   **/
  public void setFormId(String formId) {
    this.formId = formId;
  }


  /**
   * accountId.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance accountId(String accountId) {
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
   * clientUserId.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

  /**
   * Get clientUserId.
   * @return clientUserId
   **/
  @Schema(description = "")
  public String getClientUserId() {
    return clientUserId;
  }

  /**
   * setClientUserId.
   **/
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  /**
   * tags.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance tags(java.util.List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  /**
   * addTagsItem.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new java.util.ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags provided by the user with each request. This field is optional..
   * @return tags
   **/
  @Schema(example = "[\"loan_application\",\"finance_dept\"]", description = "List of tags provided by the user with each request. This field is optional.")
  public java.util.List<String> getTags() {
    return tags;
  }

  /**
   * setTags.
   **/
  public void setTags(java.util.List<String> tags) {
    this.tags = tags;
  }


  /**
   * status.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance status(InstanceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status.
   * @return status
   **/
  @Schema(description = "")
  public InstanceStatus getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(InstanceStatus status) {
    this.status = status;
  }


  /**
   * envelopes.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance envelopes(java.util.List<WebFormInstanceEnvelopes> envelopes) {
    this.envelopes = envelopes;
    return this;
  }
  
  /**
   * addEnvelopesItem.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance addEnvelopesItem(WebFormInstanceEnvelopes envelopesItem) {
    if (this.envelopes == null) {
      this.envelopes = new java.util.ArrayList<>();
    }
    this.envelopes.add(envelopesItem);
    return this;
  }

  /**
   * The associated envelope that is created when the instance is submitted.
   * @return envelopes
   **/
  @Schema(description = "The associated envelope that is created when the instance is submitted")
  public java.util.List<WebFormInstanceEnvelopes> getEnvelopes() {
    return envelopes;
  }

  /**
   * setEnvelopes.
   **/
  public void setEnvelopes(java.util.List<WebFormInstanceEnvelopes> envelopes) {
    this.envelopes = envelopes;
  }


  /**
   * instanceMetadata.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance instanceMetadata(WebFormInstanceMetadata instanceMetadata) {
    this.instanceMetadata = instanceMetadata;
    return this;
  }

  /**
   * Get instanceMetadata.
   * @return instanceMetadata
   **/
  @Schema(description = "")
  public WebFormInstanceMetadata getInstanceMetadata() {
    return instanceMetadata;
  }

  /**
   * setInstanceMetadata.
   **/
  public void setInstanceMetadata(WebFormInstanceMetadata instanceMetadata) {
    this.instanceMetadata = instanceMetadata;
  }


  /**
   * formValues.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance formValues(java.util.Map<String, Object> formValues) {
    this.formValues = formValues;
    return this;
  }

  /**
   * putFormValuesItem.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance putFormValuesItem(String key, Object formValuesItem) {
    if (this.formValues == null) {
      this.formValues = new java.util.HashMap<>();
    }
    this.formValues.put(key, formValuesItem);
    return this;
  }

  /**
   * Key-value pairs (where key is the component name and value is the form value) used to create a form instance. For key of type TextBox, Email, Date, Select and RadioButtonGroup the value is of string type. For key of type Number, the value is of number type. For key of type of CheckboxGroup, the value is of type array of string..
   * @return formValues
   **/
  @Schema(example = "{\"Textbox_Name\":\"First Last\",\"Email_primary\":\"example@example.com\",\"Date_birth\":\"2020-01-01\",\"Number_age\":52,\"Select_state\":\"California\",\"Radio_Gender\":\"Female\",\"Checkbox_hobbies\":[\"singing\",\"dancing\"],\"ID_card_attachment\":{\"documentName\":\"id_card.pdf\"}}", description = "Key-value pairs (where key is the component name and value is the form value) used to create a form instance. For key of type TextBox, Email, Date, Select and RadioButtonGroup the value is of string type. For key of type Number, the value is of number type. For key of type of CheckboxGroup, the value is of type array of string.")
  public java.util.Map<String, Object> getFormValues() {
    return formValues;
  }

  /**
   * setFormValues.
   **/
  public void setFormValues(java.util.Map<String, Object> formValues) {
    this.formValues = formValues;
  }


  /**
   * brandId.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance brandId(String brandId) {
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
   * recipients.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance recipients(java.util.List<WebFormInstanceRecipients> recipients) {
    this.recipients = recipients;
    return this;
  }
  
  /**
   * addRecipientsItem.
   *
   * @return WebFormInstance
   **/
  public WebFormInstance addRecipientsItem(WebFormInstanceRecipients recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new java.util.ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * The associated envelope that is created when the instance is submitted.
   * @return recipients
   **/
  @Schema(description = "The associated envelope that is created when the instance is submitted")
  public java.util.List<WebFormInstanceRecipients> getRecipients() {
    return recipients;
  }

  /**
   * setRecipients.
   **/
  public void setRecipients(java.util.List<WebFormInstanceRecipients> recipients) {
    this.recipients = recipients;
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
    WebFormInstance webFormInstance = (WebFormInstance) o;
    return Objects.equals(this.formUrl, webFormInstance.formUrl) &&
        Objects.equals(this.instanceToken, webFormInstance.instanceToken) &&
        Objects.equals(this.tokenExpirationDateTime, webFormInstance.tokenExpirationDateTime) &&
        Objects.equals(this.id, webFormInstance.id) &&
        Objects.equals(this.formId, webFormInstance.formId) &&
        Objects.equals(this.accountId, webFormInstance.accountId) &&
        Objects.equals(this.clientUserId, webFormInstance.clientUserId) &&
        Objects.equals(this.tags, webFormInstance.tags) &&
        Objects.equals(this.status, webFormInstance.status) &&
        Objects.equals(this.envelopes, webFormInstance.envelopes) &&
        Objects.equals(this.instanceMetadata, webFormInstance.instanceMetadata) &&
        Objects.equals(this.formValues, webFormInstance.formValues) &&
        Objects.equals(this.brandId, webFormInstance.brandId) &&
        Objects.equals(this.recipients, webFormInstance.recipients);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formUrl, instanceToken, tokenExpirationDateTime, id, formId, accountId, clientUserId, tags, status, envelopes, instanceMetadata, formValues, brandId, recipients);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormInstance {\n");
    
    sb.append("    formUrl: ").append(toIndentedString(formUrl)).append("\n");
    sb.append("    instanceToken: ").append(toIndentedString(instanceToken)).append("\n");
    sb.append("    tokenExpirationDateTime: ").append(toIndentedString(tokenExpirationDateTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    envelopes: ").append(toIndentedString(envelopes)).append("\n");
    sb.append("    instanceMetadata: ").append(toIndentedString(instanceMetadata)).append("\n");
    sb.append("    formValues: ").append(toIndentedString(formValues)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

