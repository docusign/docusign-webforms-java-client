package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The current status of the instance for the recipient
 */
public enum InstanceRecipientStatus {
  
  INITIATED("INITIATED"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  SUBMITTED("SUBMITTED");

  private String value;

  InstanceRecipientStatus(String value) {
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
  public static InstanceRecipientStatus fromValue(String value) {
    for (InstanceRecipientStatus b : InstanceRecipientStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

