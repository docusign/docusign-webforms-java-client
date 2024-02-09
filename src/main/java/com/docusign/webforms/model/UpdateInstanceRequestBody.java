package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.WebFormValues;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Request body containing properties that needs to be updated..
 *
 */
@Schema(description = "Request body containing properties that needs to be updated.")

public class UpdateInstanceRequestBody {
  @JsonProperty("formValues")
  private WebFormValues formValues = null;


  /**
   * formValues.
   *
   * @return UpdateInstanceRequestBody
   **/
  public UpdateInstanceRequestBody formValues(WebFormValues formValues) {
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
    UpdateInstanceRequestBody updateInstanceRequestBody = (UpdateInstanceRequestBody) o;
    return Objects.equals(this.formValues, updateInstanceRequestBody.formValues);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(formValues);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInstanceRequestBody {\n");
    
    sb.append("    formValues: ").append(toIndentedString(formValues)).append("\n");
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

