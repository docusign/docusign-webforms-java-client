package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The method through which form instance is created.
 */
public enum Source {
  
  PUBLIC_URL("PUBLIC_URL"),
  
  API_EMBEDDED("API_EMBEDDED"),
  
  API_REMOTE("API_REMOTE"),
  
  UI_REMOTE("UI_REMOTE");

  private String value;

  Source(String value) {
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
  public static Source fromValue(String value) {
    for (Source b : Source.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

