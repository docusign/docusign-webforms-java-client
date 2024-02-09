package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of components used in the web form
 */
public enum WebFormComponentType {
  
  CHECKBOXGROUP("CheckboxGroup"),
  
  DATE("Date"),
  
  EMAIL("Email"),
  
  NUMBER("Number"),
  
  RADIOBUTTONGROUP("RadioButtonGroup"),
  
  SELECT("Select"),
  
  TEXTBOX("TextBox");

  private String value;

  WebFormComponentType(String value) {
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
  public static WebFormComponentType fromValue(String value) {
    for (WebFormComponentType b : WebFormComponentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

