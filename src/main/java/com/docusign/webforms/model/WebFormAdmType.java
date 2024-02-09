package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type used at ADM model as ComponentType decorator. \&quot;String\&quot;, \&quot;Boolean\&quot;, \&quot;Double\&quot;, \&quot;DateTime\&quot;, ArrayOfString\&quot; are deprecated.
 */
public enum WebFormAdmType {
  
  STRING("String"),
  
  BOOLEAN("Boolean"),
  
  DOUBLE("Double"),
  
  DATETIME("DateTime"),
  
  ARRAYOFSTRING("ArrayOfString"),
  
  CHECKBOXGROUP("CheckboxGroup"),
  
  DATE("Date"),
  
  EMAIL("Email"),
  
  NUMBER("Number"),
  
  RADIOBUTTONGROUP("RadioButtonGroup"),
  
  SELECT("Select"),
  
  TEXTBOX("TextBox");

  private String value;

  WebFormAdmType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WebFormAdmType fromValue(String value) {
    for (WebFormAdmType b : WebFormAdmType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

