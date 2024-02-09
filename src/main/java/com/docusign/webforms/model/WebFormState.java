package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The state of the form content
 */
public enum WebFormState {
  
  ACTIVE("active"),
  
  DRAFT("draft");

  private String value;

  WebFormState(String value) {
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
  public static WebFormState fromValue(String value) {
    for (WebFormState b : WebFormState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

