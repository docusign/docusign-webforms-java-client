package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Information about a DocuSign system user. The user exists within the account associated with the form..
 *
 */
@Schema(description = "Information about a DocuSign system user. The user exists within the account associated with the form.")

public class WebFormUserInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;


  /**
   * userId.
   *
   * @return WebFormUserInfo
   **/
  public WebFormUserInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId.
   * @return userId
   **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * userName.
   *
   * @return WebFormUserInfo
   **/
  public WebFormUserInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Name of the user that can be displayed in the user interface..
   * @return userName
   **/
  @Schema(example = "John Doe", description = "Name of the user that can be displayed in the user interface.")
  public String getUserName() {
    return userName;
  }

  /**
   * setUserName.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebFormUserInfo webFormUserInfo = (WebFormUserInfo) o;
    return Objects.equals(this.userId, webFormUserInfo.userId) &&
        Objects.equals(this.userName, webFormUserInfo.userName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId, userName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormUserInfo {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

