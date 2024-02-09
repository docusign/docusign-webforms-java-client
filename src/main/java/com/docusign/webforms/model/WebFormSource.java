package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The source from which the web form is created.
 */
public enum WebFormSource {
  
  TEMPLATES("templates"),
  
  BLANK("blank");

  private String value;

  WebFormSource(String value) {
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
  public static WebFormSource fromValue(String value) {
    for (WebFormSource b : WebFormSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

