package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the delivery behavior of the web form. - &#x60;now&#x60;: The web form will be sent immediately. 
 */
public enum SendOption {
  
  NOW("now");

  private String value;

  SendOption(String value) {
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
  public static SendOption fromValue(String value) {
    for (SendOption b : SendOption.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

