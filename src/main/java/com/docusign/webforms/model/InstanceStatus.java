package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of Web Form Instance. If the form status is INITIATED, it means the form is accessible until it is submitted or expired. If the form status is SUBMITTED, it means the form is submitted already and hence, cannot be opened again.
 */
public enum InstanceStatus {
  
  INITIATED("INITIATED"),
  
  SUBMITTED("SUBMITTED"),
  
  EXPIRED("EXPIRED"),
  
  FAILED("FAILED");

  private String value;

  InstanceStatus(String value) {
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
  public static InstanceStatus fromValue(String value) {
    for (InstanceStatus b : InstanceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

