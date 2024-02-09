package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Key-value pairs (where key is the component name and value is the form value) used to create a form instance. For key of type TextBox, Email, Date, Select and RadioButtonGroup the value is of string type. For key of type Number, the value is of number type. For key of type of CheckboxGroup, the value is of type array of string..
 *
 */
@Schema(description = "Key-value pairs (where key is the component name and value is the form value) used to create a form instance. For key of type TextBox, Email, Date, Select and RadioButtonGroup the value is of string type. For key of type Number, the value is of number type. For key of type of CheckboxGroup, the value is of type array of string.")

public class WebFormValues extends java.util.HashMap<String, Object> {

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
    return super.equals(o);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormValues {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

