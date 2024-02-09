
package com.docusign.webforms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.webforms.client.ApiException;
import com.docusign.webforms.client.ApiClient;
import com.docusign.webforms.client.Configuration;
import com.docusign.webforms.model.*;
import com.docusign.webforms.client.Pair;
import com.docusign.webforms.client.ApiResponse;




/**
 * FormManagementApi class.
 *
 **/
public class FormManagementApi {
  private ApiClient apiClient;

 /**
  * FormManagementApi.
  *
  **/
  public FormManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * FormManagementApi.
  *
  **/
  public FormManagementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

 /**
  * getApiClient Method.
  *
  * @return ApiClient
  **/
  public ApiClient getApiClient() {
    return apiClient;
  }

 /**
  * setApiClient Method.
  *
  **/
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /// <summary>
  /// Get Form Retrieves form information filter by form id and state. The &#x60;state&#x60; parameter is optional and can accept value from &#x60;draft, active&#x60;.
  /// </summary>

 /**
  * GetFormOptions Class.
  *
  **/
  public class GetFormOptions
  {
  private String state = null;
  
 /**
  * setState method.
  */
  public void setState(String state) {
    this.state = state;
  }

 /**
  * getState method.
  *
  * @return String
  */
  public String getState() {
    return this.state;
  }
  }

   /**
   * Get Form.
   * Retrieves form information filter by form id and state. The &#x60;state&#x60; parameter is optional and can accept value from &#x60;draft, active&#x60;.
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form that is consistent for it&#39;s lifetime (required)
   * @return WebForm
   */ 
  public WebForm getForm(String accountId, String formId) throws ApiException {
    return getForm(accountId, formId, null);
  }

  /**
   * Get Form.
   * Retrieves form information filter by form id and state. The &#x60;state&#x60; parameter is optional and can accept value from &#x60;draft, active&#x60;.
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form that is consistent for it&#39;s lifetime (required)
   * @param options for modifying the method behavior.
   * @return WebForm
   * @throws ApiException if fails to make API call
   */
  public WebForm getForm(String accountId, String formId, FormManagementApi.GetFormOptions options) throws ApiException {
    ApiResponse<WebForm> localVarResponse = getFormWithHttpInfo(accountId, formId, options);
    return localVarResponse.getData();
  }

  /**
   * Get Form
   * Retrieves form information filter by form id and state. The &#x60;state&#x60; parameter is optional and can accept value from &#x60;draft, active&#x60;.
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form that is consistent for it&#39;s lifetime (required)
   * @param options for modifying the method behavior.
   * @return WebForm
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebForm > getFormWithHttpInfo(String accountId, String formId, FormManagementApi.GetFormOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getForm");
    }
    
    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling getForm");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/forms/{form_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("state", options.state));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<WebForm> localVarReturnType = new GenericType<WebForm>() {};
    WebForm localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WebForm>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// List Forms List all the forms for the active user that can be in an active or draft state
  /// </summary>

 /**
  * ListFormsOptions Class.
  *
  **/
  public class ListFormsOptions
  {
  private String userFilter = null;
  private Boolean isStandalone = null;
  private Boolean isPublished = null;
  private String sortBy = null;
  private String search = null;
  private String startPosition = null;
  private String count = null;
  
 /**
  * setUserFilter method.
  */
  public void setUserFilter(String userFilter) {
    this.userFilter = userFilter;
  }

 /**
  * getUserFilter method.
  *
  * @return String
  */
  public String getUserFilter() {
    return this.userFilter;
  }
  
 /**
  * setIsStandalone method.
  */
  public void setIsStandalone(Boolean isStandalone) {
    this.isStandalone = isStandalone;
  }

 /**
  * getIsStandalone method.
  *
  * @return Boolean
  */
  public Boolean getIsStandalone() {
    return this.isStandalone;
  }
  
 /**
  * setIsPublished method.
  */
  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

 /**
  * getIsPublished method.
  *
  * @return Boolean
  */
  public Boolean getIsPublished() {
    return this.isPublished;
  }
  
 /**
  * setSortBy method.
  */
  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

 /**
  * getSortBy method.
  *
  * @return String
  */
  public String getSortBy() {
    return this.sortBy;
  }
  
 /**
  * setSearch method.
  */
  public void setSearch(String search) {
    this.search = search;
  }

 /**
  * getSearch method.
  *
  * @return String
  */
  public String getSearch() {
    return this.search;
  }
  
 /**
  * setStartPosition method.
  */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

 /**
  * getStartPosition method.
  *
  * @return String
  */
  public String getStartPosition() {
    return this.startPosition;
  }
  
 /**
  * setCount method.
  */
  public void setCount(String count) {
    this.count = count;
  }

 /**
  * getCount method.
  *
  * @return String
  */
  public String getCount() {
    return this.count;
  }
  }

   /**
   * List Forms.
   * List all the forms for the active user that can be in an active or draft state
   * @param accountId Account identifier in which the webform resides (required)
   * @return WebFormSummaryList
   */ 
  public WebFormSummaryList listForms(String accountId) throws ApiException {
    return listForms(accountId, null);
  }

  /**
   * List Forms.
   * List all the forms for the active user that can be in an active or draft state
   * @param accountId Account identifier in which the webform resides (required)
   * @param options for modifying the method behavior.
   * @return WebFormSummaryList
   * @throws ApiException if fails to make API call
   */
  public WebFormSummaryList listForms(String accountId, FormManagementApi.ListFormsOptions options) throws ApiException {
    ApiResponse<WebFormSummaryList> localVarResponse = listFormsWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * List Forms
   * List all the forms for the active user that can be in an active or draft state
   * @param accountId Account identifier in which the webform resides (required)
   * @param options for modifying the method behavior.
   * @return WebFormSummaryList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebFormSummaryList > listFormsWithHttpInfo(String accountId, FormManagementApi.ListFormsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listForms");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/forms"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_filter", options.userFilter));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("is_standalone", options.isStandalone));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("is_published", options.isPublished));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("sort_by", options.sortBy));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search", options.search));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<WebFormSummaryList> localVarReturnType = new GenericType<WebFormSummaryList>() {};
    WebFormSummaryList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WebFormSummaryList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
