package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The method through which form instance is created.
 */
public enum InstanceSource {
  
  PUBLIC_URL("PUBLIC_URL"),
  
  API_EMBEDDED("API_EMBEDDED"),
  
  API_REMOTE("API_REMOTE"),
  
  UI_REMOTE("UI_REMOTE"),
  
  WORKFLOW("WORKFLOW");

  private String value;

  InstanceSource(String value) {
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
  public static InstanceSource fromValue(String value) {
    for (InstanceSource b : InstanceSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

