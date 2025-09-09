package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Phone number of the user..
 *
 */
@Schema(description = "Phone number of the user.")

public class PhoneNumber implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("nationalNumber")
  private String nationalNumber = null;


  /**
   * countryCode.
   *
   * @return PhoneNumber
   **/
  public PhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * country code of the registered phone number..
   * @return countryCode
   **/
  @Schema(example = "1", description = "country code of the registered phone number.")
  public String getCountryCode() {
    return countryCode;
  }

  /**
   * setCountryCode.
   **/
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * nationalNumber.
   *
   * @return PhoneNumber
   **/
  public PhoneNumber nationalNumber(String nationalNumber) {
    this.nationalNumber = nationalNumber;
    return this;
  }

  /**
   * Phone number of the user (without country code)..
   * @return nationalNumber
   **/
  @Schema(example = "4151112222", description = "Phone number of the user (without country code).")
  public String getNationalNumber() {
    return nationalNumber;
  }

  /**
   * setNationalNumber.
   **/
  public void setNationalNumber(String nationalNumber) {
    this.nationalNumber = nationalNumber;
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
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(this.countryCode, phoneNumber.countryCode) &&
        Objects.equals(this.nationalNumber, phoneNumber.nationalNumber);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(countryCode, nationalNumber);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    nationalNumber: ").append(toIndentedString(nationalNumber)).append("\n");
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

