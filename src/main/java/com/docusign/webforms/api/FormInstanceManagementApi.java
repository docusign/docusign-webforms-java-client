
package com.docusign.webforms.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.webforms.client.ApiException;
import com.docusign.webforms.client.ApiClient;
import com.docusign.webforms.client.Configuration;
import com.docusign.webforms.model.*;
import com.docusign.webforms.client.Pair;
import com.docusign.webforms.client.ApiResponse;




/**
 * FormInstanceManagementApi class.
 *
 **/
public class FormInstanceManagementApi {
  private ApiClient apiClient;

 /**
  * FormInstanceManagementApi.
  *
  **/
  public FormInstanceManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * FormInstanceManagementApi.
  *
  **/
  public FormInstanceManagementApi(ApiClient apiClient) {
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


  /**
   * Creates an instance of the web form.
   * Creates an instance of the web form.
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form entity that is consistent for it&#39;s lifetime (required)
   * @param createInstanceBody Request body containing properties that will be used to create instance. (required)
   * @return WebFormInstance
   * @throws ApiException if fails to make API call
   */
  public WebFormInstance createInstance(String accountId, String formId, CreateInstanceRequestBody createInstanceBody) throws ApiException {
    ApiResponse<WebFormInstance> localVarResponse = createInstanceWithHttpInfo(accountId, formId, createInstanceBody);
    return localVarResponse.getData();
  }

  /**
   * Creates an instance of the web form
   * Creates an instance of the web form.
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form entity that is consistent for it&#39;s lifetime (required)
   * @param createInstanceBody Request body containing properties that will be used to create instance. (required)
   * @return WebFormInstance
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebFormInstance > createInstanceWithHttpInfo(String accountId, String formId, CreateInstanceRequestBody createInstanceBody) throws ApiException {
    Object localVarPostBody = createInstanceBody;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createInstance");
    }
    
    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling createInstance");
    }
    
    // verify the required parameter 'createInstanceBody' is set
    if (createInstanceBody == null) {
      throw new ApiException(400, "Missing the required parameter 'createInstanceBody' when calling createInstance");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/forms/{form_id}/instances"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<WebFormInstance> localVarReturnType = new GenericType<WebFormInstance>() {};
    WebFormInstance localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WebFormInstance>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Get form instance.
   * Retrieves instance information filter by instance id
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form entity that is consistent for it&#39;s lifetime (required)
   * @param instanceId Unique identifier for a Web Form Instance that is consistent until its expiration (required)
   * @return WebFormInstance
   * @throws ApiException if fails to make API call
   */
  public WebFormInstance getInstance(String accountId, String formId, String instanceId) throws ApiException {
    ApiResponse<WebFormInstance> localVarResponse = getInstanceWithHttpInfo(accountId, formId, instanceId);
    return localVarResponse.getData();
  }

  /**
   * Get form instance
   * Retrieves instance information filter by instance id
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form entity that is consistent for it&#39;s lifetime (required)
   * @param instanceId Unique identifier for a Web Form Instance that is consistent until its expiration (required)
   * @return WebFormInstance
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebFormInstance > getInstanceWithHttpInfo(String accountId, String formId, String instanceId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getInstance");
    }
    
    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling getInstance");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling getInstance");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/forms/{form_id}/instances/{instance_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()))
      .replaceAll("\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<WebFormInstance> localVarReturnType = new GenericType<WebFormInstance>() {};
    WebFormInstance localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WebFormInstance>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// List instances List all the instances of a web form in an account. When filtered by clientUserId, it will return instances having same clientUserId
  /// </summary>

 /**
  * ListInstancesOptions Class.
  *
  **/
  public class ListInstancesOptions
  {
  private String clientUserId = null;
  
 /**
  * setClientUserId method.
  */
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

 /**
  * getClientUserId method.
  *
  * @return String
  */
  public String getClientUserId() {
    return this.clientUserId;
  }
  }

   /**
   * List instances.
   * List all the instances of a web form in an account. When filtered by clientUserId, it will return instances having same clientUserId
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form that is consistent for it&#39;s lifetime (required)
   * @return WebFormInstanceList
   */ 
  public WebFormInstanceList listInstances(String accountId, String formId) throws ApiException {
    return listInstances(accountId, formId, null);
  }

  /**
   * List instances.
   * List all the instances of a web form in an account. When filtered by clientUserId, it will return instances having same clientUserId
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form that is consistent for it&#39;s lifetime (required)
   * @param options for modifying the method behavior.
   * @return WebFormInstanceList
   * @throws ApiException if fails to make API call
   */
  public WebFormInstanceList listInstances(String accountId, String formId, FormInstanceManagementApi.ListInstancesOptions options) throws ApiException {
    ApiResponse<WebFormInstanceList> localVarResponse = listInstancesWithHttpInfo(accountId, formId, options);
    return localVarResponse.getData();
  }

  /**
   * List instances
   * List all the instances of a web form in an account. When filtered by clientUserId, it will return instances having same clientUserId
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form that is consistent for it&#39;s lifetime (required)
   * @param options for modifying the method behavior.
   * @return WebFormInstanceList
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebFormInstanceList > listInstancesWithHttpInfo(String accountId, String formId, FormInstanceManagementApi.ListInstancesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listInstances");
    }
    
    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling listInstances");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/forms/{form_id}/instances"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("client_user_id", options.clientUserId));
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
    
    GenericType<WebFormInstanceList> localVarReturnType = new GenericType<WebFormInstanceList>() {};
    WebFormInstanceList localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WebFormInstanceList>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Refreshes the instance token.
   * Generates new instance token for the existing Web Form Instance.
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form entity that is consistent for it&#39;s lifetime (required)
   * @param instanceId Unique identifier for a Web Form Instance that is consistent until its expiration (required)
   * @return WebFormInstance
   * @throws ApiException if fails to make API call
   */
  public WebFormInstance refreshToken(String accountId, String formId, String instanceId) throws ApiException {
    ApiResponse<WebFormInstance> localVarResponse = refreshTokenWithHttpInfo(accountId, formId, instanceId);
    return localVarResponse.getData();
  }

  /**
   * Refreshes the instance token
   * Generates new instance token for the existing Web Form Instance.
   * @param accountId Account identifier in which the web form resides (required)
   * @param formId Unique identifier for a web form entity that is consistent for it&#39;s lifetime (required)
   * @param instanceId Unique identifier for a Web Form Instance that is consistent until its expiration (required)
   * @return WebFormInstance
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebFormInstance > refreshTokenWithHttpInfo(String accountId, String formId, String instanceId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling refreshToken");
    }
    
    // verify the required parameter 'formId' is set
    if (formId == null) {
      throw new ApiException(400, "Missing the required parameter 'formId' when calling refreshToken");
    }
    
    // verify the required parameter 'instanceId' is set
    if (instanceId == null) {
      throw new ApiException(400, "Missing the required parameter 'instanceId' when calling refreshToken");
    }
    
    // create path and map variables
    String localVarPath = "/accounts/{account_id}/forms/{form_id}/instances/{instance_id}/refresh"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "form_id" + "\\}", apiClient.escapeString(formId.toString()))
      .replaceAll("\\{" + "instance_id" + "\\}", apiClient.escapeString(instanceId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<WebFormInstance> localVarReturnType = new GenericType<WebFormInstance>() {};
    WebFormInstance localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<WebFormInstance>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
