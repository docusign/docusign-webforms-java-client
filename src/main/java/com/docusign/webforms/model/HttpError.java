package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * An error occurred while processing a request. Source - https://www.baeldung.com/rest-api-error-handling-best-practices.
 *
 */
@Schema(description = "An error occurred while processing a request. Source - https://www.baeldung.com/rest-api-error-handling-best-practices")

public class HttpError {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("message")
  private String message = null;


  /**
   * errorCode.
   *
   * @return HttpError
   **/
  public HttpError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * A granular, human and computer readable code indicating more deeply what error occurred..
   * @return errorCode
   **/
  @Schema(description = "A granular, human and computer readable code indicating more deeply what error occurred.")
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * setErrorCode.
   **/
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * message.
   *
   * @return HttpError
   **/
  public HttpError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable description of the error, meant for developers to store for their review..
   * @return message
   **/
  @Schema(description = "A human-readable description of the error, meant for developers to store for their review.")
  public String getMessage() {
    return message;
  }

  /**
   * setMessage.
   **/
  public void setMessage(String message) {
    this.message = message;
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
    HttpError httpError = (HttpError) o;
    return Objects.equals(this.errorCode, httpError.errorCode) &&
        Objects.equals(this.message, httpError.message);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpError {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

