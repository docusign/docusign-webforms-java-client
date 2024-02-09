package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.AuthenticationMethod;
import com.docusign.webforms.model.WebFormValues;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Request body containing properties that will be used to create instance..
 *
 */
@Schema(description = "Request body containing properties that will be used to create instance.")

public class CreateInstanceRequestBody {
  @JsonProperty("formValues")
  private WebFormValues formValues = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("authenticationInstant")
  private String authenticationInstant = null;

  @JsonProperty("authenticationMethod")
  private AuthenticationMethod authenticationMethod = null;

  @JsonProperty("assertionId")
  private String assertionId = null;

  @JsonProperty("securityDomain")
  private String securityDomain = null;

  @JsonProperty("returnUrl")
  private String returnUrl = null;

  @JsonProperty("expirationOffset")
  private Integer expirationOffset = null;

  @JsonProperty("tags")
  private java.util.List<String> tags = null;


  /**
   * formValues.
   *
   * @return CreateInstanceRequestBody
   **/
  public CreateInstanceRequestBody formValues(WebFormValues formValues) {
    this.formValues = formValues;
    return this;
  }

  /**
   * Get formValues.
   * @return formValues
   **/
  @Schema(description = "")
  public WebFormValues getFormValues() {
    return formValues;
  }

  /**
   * setFormValues.
   **/
  public void setFormValues(WebFormValues formValues) {
    this.formValues = formValues;
  }


  /**
   * clientUserId.
   *
   * @return CreateInstanceRequestBody
   **/
  public CreateInstanceRequestBody clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

  /**
   * Get clientUserId.
   * @return clientUserId
   **/
  @Schema(required = true, description = "")
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
   * authenticationInstant.
   *
   * @return CreateInstanceRequestBody
   **/
  public CreateInstanceRequestBody authenticationInstant(String authenticationInstant) {
    this.authenticationInstant = authenticationInstant;
    return this;
  }

  /**
   * Get authenticationInstant.
   * @return authenticationInstant
   **/
  @Schema(description = "")
  public String getAuthenticationInstant() {
    return authenticationInstant;
  }

  /**
   * setAuthenticationInstant.
   **/
  public void setAuthenticationInstant(String authenticationInstant) {
    this.authenticationInstant = authenticationInstant;
  }


  /**
   * authenticationMethod.
   *
   * @return CreateInstanceRequestBody
   **/
  public CreateInstanceRequestBody authenticationMethod(AuthenticationMethod authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

  /**
   * Get authenticationMethod.
   * @return authenticationMethod
   **/
  @Schema(description = "")
  public AuthenticationMethod getAuthenticationMethod() {
    return authenticationMethod;
  }

  /**
   * setAuthenticationMethod.
   **/
  public void setAuthenticationMethod(AuthenticationMethod authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }


  /**
   * assertionId.
   *
   * @return CreateInstanceRequestBody
   **/
  public CreateInstanceRequestBody assertionId(String assertionId) {
    this.assertionId = assertionId;
    return this;
  }

  /**
   * Get assertionId.
   * @return assertionId
   **/
  @Schema(description = "")
  public String getAssertionId() {
    return assertionId;
  }

  /**
   * setAssertionId.
   **/
  public void setAssertionId(String assertionId) {
    this.assertionId = assertionId;
  }


  /**
   * securityDomain.
   *
   * @return CreateInstanceRequestBody
   **/
  public CreateInstanceRequestBody securityDomain(String securityDomain) {
    this.securityDomain = securityDomain;
    return this;
  }

  /**
   * Get securityDomain.
   * @return securityDomain
   **/
  @Schema(description = "")
  public String getSecurityDomain() {
    return securityDomain;
  }

  /**
   * setSecurityDomain.
   **/
  public void setSecurityDomain(String securityDomain) {
    this.securityDomain = securityDomain;
  }


  /**
   * returnUrl.
   *
   * @return CreateInstanceRequestBody
   **/
  public CreateInstanceRequestBody returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

  /**
   * Get returnUrl.
   * @return returnUrl
   **/
  @Schema(description = "")
  public String getReturnUrl() {
    return returnUrl;
  }

  /**
   * setReturnUrl.
   **/
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  /**
   * expirationOffset.
   *
   * @return CreateInstanceRequestBody
   **/
  public CreateInstanceRequestBody expirationOffset(Integer expirationOffset) {
    this.expirationOffset = expirationOffset;
    return this;
  }

  /**
   * Get expirationOffset.
   * @return expirationOffset
   **/
  @Schema(description = "")
  public Integer getExpirationOffset() {
    return expirationOffset;
  }

  /**
   * setExpirationOffset.
   **/
  public void setExpirationOffset(Integer expirationOffset) {
    this.expirationOffset = expirationOffset;
  }


  /**
   * tags.
   *
   * @return CreateInstanceRequestBody
   **/
  public CreateInstanceRequestBody tags(java.util.List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  /**
   * addTagsItem.
   *
   * @return CreateInstanceRequestBody
   **/
  public CreateInstanceRequestBody addTagsItem(String tagsItem) {
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
    CreateInstanceRequestBody createInstanceRequestBody = (CreateInstanceRequestBody) o;
    return Objects.equals(this.formValues, createInstanceRequestBody.formValues) &&
        Objects.equals(this.clientUserId, createInstanceRequestBody.clientUserId) &&
        Objects.equals(this.authenticationInstant, createInstanceRequestBody.authenticationInstant) &&
        Objects.equals(this.authenticationMethod, createInstanceRequestBody.authenticationMethod) &&
        Objects.equals(this.assertionId, createInstanceRequestBody.assertionId) &&
        Objects.equals(this.securityDomain, createInstanceRequestBody.securityDomain) &&
        Objects.equals(this.returnUrl, createInstanceRequestBody.returnUrl) &&
        Objects.equals(this.expirationOffset, createInstanceRequestBody.expirationOffset) &&
        Objects.equals(this.tags, createInstanceRequestBody.tags);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formValues, clientUserId, authenticationInstant, authenticationMethod, assertionId, securityDomain, returnUrl, expirationOffset, tags);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstanceRequestBody {\n");
    
    sb.append("    formValues: ").append(toIndentedString(formValues)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    authenticationInstant: ").append(toIndentedString(authenticationInstant)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    assertionId: ").append(toIndentedString(assertionId)).append("\n");
    sb.append("    securityDomain: ").append(toIndentedString(securityDomain)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    expirationOffset: ").append(toIndentedString(expirationOffset)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

