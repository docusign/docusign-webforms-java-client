package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.PhoneNumber;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * CreateInstanceRequestBodyRecipients.
 *
 */

public class CreateInstanceRequestBodyRecipients implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phoneNumber")
  private PhoneNumber phoneNumber = null;


  /**
   * roleName.
   *
   * @return CreateInstanceRequestBodyRecipients
   **/
  public CreateInstanceRequestBodyRecipients roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName.
   * @return roleName
   **/
  @Schema(required = true, description = "")
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
   * name.
   *
   * @return CreateInstanceRequestBodyRecipients
   **/
  public CreateInstanceRequestBodyRecipients name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * email.
   *
   * @return CreateInstanceRequestBodyRecipients
   **/
  public CreateInstanceRequestBodyRecipients email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email.
   * @return email
   **/
  @Schema(required = true, description = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * phoneNumber.
   *
   * @return CreateInstanceRequestBodyRecipients
   **/
  public CreateInstanceRequestBodyRecipients phoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber.
   * @return phoneNumber
   **/
  @Schema(description = "")
  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * setPhoneNumber.
   **/
  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
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
    CreateInstanceRequestBodyRecipients createInstanceRequestBodyRecipients = (CreateInstanceRequestBodyRecipients) o;
    return Objects.equals(this.roleName, createInstanceRequestBodyRecipients.roleName) &&
        Objects.equals(this.name, createInstanceRequestBodyRecipients.name) &&
        Objects.equals(this.email, createInstanceRequestBodyRecipients.email) &&
        Objects.equals(this.phoneNumber, createInstanceRequestBodyRecipients.phoneNumber);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(roleName, name, email, phoneNumber);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstanceRequestBodyRecipients {\n");
    
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

