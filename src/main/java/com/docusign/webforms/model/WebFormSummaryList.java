package com.docusign.webforms.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.webforms.model.WebFormSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * A list of web form summary items..
 *
 */
@Schema(description = "A list of web form summary items.")

public class WebFormSummaryList implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("items")
  private java.util.List<WebFormSummary> items = null;

  @JsonProperty("resultSetSize")
  private BigDecimal resultSetSize = null;

  @JsonProperty("totalSetSize")
  private BigDecimal totalSetSize = null;

  @JsonProperty("startPosition")
  private BigDecimal startPosition = null;

  @JsonProperty("endPosition")
  private BigDecimal endPosition = null;

  @JsonProperty("nextUrl")
  private String nextUrl = null;

  @JsonProperty("previousUrl")
  private String previousUrl = null;


  /**
   * items.
   *
   * @return WebFormSummaryList
   **/
  public WebFormSummaryList items(java.util.List<WebFormSummary> items) {
    this.items = items;
    return this;
  }
  
  /**
   * addItemsItem.
   *
   * @return WebFormSummaryList
   **/
  public WebFormSummaryList addItemsItem(WebFormSummary itemsItem) {
    if (this.items == null) {
      this.items = new java.util.ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array of web form items with each containing summary..
   * @return items
   **/
  @Schema(description = "Array of web form items with each containing summary.")
  public java.util.List<WebFormSummary> getItems() {
    return items;
  }

  /**
   * setItems.
   **/
  public void setItems(java.util.List<WebFormSummary> items) {
    this.items = items;
  }


  /**
   * resultSetSize.
   *
   * @return WebFormSummaryList
   **/
  public WebFormSummaryList resultSetSize(BigDecimal resultSetSize) {
    this.resultSetSize = resultSetSize;
    return this;
  }

  /**
   * Result set size for current page.
   * @return resultSetSize
   **/
  @Schema(example = "1.0", description = "Result set size for current page")
  public BigDecimal getResultSetSize() {
    return resultSetSize;
  }

  /**
   * setResultSetSize.
   **/
  public void setResultSetSize(BigDecimal resultSetSize) {
    this.resultSetSize = resultSetSize;
  }


  /**
   * totalSetSize.
   *
   * @return WebFormSummaryList
   **/
  public WebFormSummaryList totalSetSize(BigDecimal totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * Total result set size.
   * @return totalSetSize
   **/
  @Schema(example = "1.0", description = "Total result set size")
  public BigDecimal getTotalSetSize() {
    return totalSetSize;
  }

  /**
   * setTotalSetSize.
   **/
  public void setTotalSetSize(BigDecimal totalSetSize) {
    this.totalSetSize = totalSetSize;
  }


  /**
   * startPosition.
   *
   * @return WebFormSummaryList
   **/
  public WebFormSummaryList startPosition(BigDecimal startPosition) {
    this.startPosition = startPosition;
    return this;
  }

  /**
   * Starting position of fields returned for the current page.
   * @return startPosition
   **/
  @Schema(example = "1.0", description = "Starting position of fields returned for the current page")
  public BigDecimal getStartPosition() {
    return startPosition;
  }

  /**
   * setStartPosition.
   **/
  public void setStartPosition(BigDecimal startPosition) {
    this.startPosition = startPosition;
  }


  /**
   * endPosition.
   *
   * @return WebFormSummaryList
   **/
  public WebFormSummaryList endPosition(BigDecimal endPosition) {
    this.endPosition = endPosition;
    return this;
  }

  /**
   * Ending position of fields returned for the current page.
   * @return endPosition
   **/
  @Schema(example = "1.0", description = "Ending position of fields returned for the current page")
  public BigDecimal getEndPosition() {
    return endPosition;
  }

  /**
   * setEndPosition.
   **/
  public void setEndPosition(BigDecimal endPosition) {
    this.endPosition = endPosition;
  }


  /**
   * nextUrl.
   *
   * @return WebFormSummaryList
   **/
  public WebFormSummaryList nextUrl(String nextUrl) {
    this.nextUrl = nextUrl;
    return this;
  }

  /**
   * Url for the next page of results.
   * @return nextUrl
   **/
  @Schema(description = "Url for the next page of results")
  public String getNextUrl() {
    return nextUrl;
  }

  /**
   * setNextUrl.
   **/
  public void setNextUrl(String nextUrl) {
    this.nextUrl = nextUrl;
  }


  /**
   * previousUrl.
   *
   * @return WebFormSummaryList
   **/
  public WebFormSummaryList previousUrl(String previousUrl) {
    this.previousUrl = previousUrl;
    return this;
  }

  /**
   * Url for the previous page of results.
   * @return previousUrl
   **/
  @Schema(description = "Url for the previous page of results")
  public String getPreviousUrl() {
    return previousUrl;
  }

  /**
   * setPreviousUrl.
   **/
  public void setPreviousUrl(String previousUrl) {
    this.previousUrl = previousUrl;
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
    WebFormSummaryList webFormSummaryList = (WebFormSummaryList) o;
    return Objects.equals(this.items, webFormSummaryList.items) &&
        Objects.equals(this.resultSetSize, webFormSummaryList.resultSetSize) &&
        Objects.equals(this.totalSetSize, webFormSummaryList.totalSetSize) &&
        Objects.equals(this.startPosition, webFormSummaryList.startPosition) &&
        Objects.equals(this.endPosition, webFormSummaryList.endPosition) &&
        Objects.equals(this.nextUrl, webFormSummaryList.nextUrl) &&
        Objects.equals(this.previousUrl, webFormSummaryList.previousUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(items, resultSetSize, totalSetSize, startPosition, endPosition, nextUrl, previousUrl);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebFormSummaryList {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    nextUrl: ").append(toIndentedString(nextUrl)).append("\n");
    sb.append("    previousUrl: ").append(toIndentedString(previousUrl)).append("\n");
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

