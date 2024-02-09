package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Filter which forms are returned
 */
public enum UserFilter {
  
  OWNED_BY_ME("owned_by_me"),
  
  SHARED_WITH_ME("shared_with_me"),
  
  ALL("all");

  private String value;

  UserFilter(String value) {
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
  public static UserFilter fromValue(String value) {
    for (UserFilter b : UserFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

