package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The field indicates webform type.
 */
public enum WebFormType {
  
  STANDALONE("standalone"),
  
  HASESIGNTEMPLATE("hasEsignTemplate");

  private String value;

  WebFormType(String value) {
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
  public static WebFormType fromValue(String value) {
    for (WebFormType b : WebFormType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

