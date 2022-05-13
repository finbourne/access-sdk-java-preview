/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1978
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.api;

import com.finbourne.access.ApiCallback;
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.ApiResponse;
import com.finbourne.access.Configuration;
import com.finbourne.access.Pair;
import com.finbourne.access.ProgressRequestBody;
import com.finbourne.access.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.access.model.LusidProblemDetails;
import com.finbourne.access.model.LusidValidationProblemDetails;
import com.finbourne.access.model.ResourceListOfUserRoleResponse;
import com.finbourne.access.model.UserRoleCreationRequest;
import com.finbourne.access.model.UserRoleResponse;
import com.finbourne.access.model.UserRoleUpdateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRolesApi {
    private ApiClient localVarApiClient;
    public UserRolesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserRolesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createUserRole
     * @param userRoleCreationRequest Definition of the user-role to create. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User role that has been created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createUserRoleCall(UserRoleCreationRequest userRoleCreationRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = userRoleCreationRequest;

        // create path and map variables
        String localVarPath = "/api/userroles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.1978");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createUserRoleValidateBeforeCall(UserRoleCreationRequest userRoleCreationRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userRoleCreationRequest' is set
        if (userRoleCreationRequest == null) {
            throw new ApiException("Missing the required parameter 'userRoleCreationRequest' when calling createUserRole(Async)");
        }
        

        okhttp3.Call localVarCall = createUserRoleCall(userRoleCreationRequest, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] CreateUserRole: Create a user-role
     * Creates a new user-role.
     * @param userRoleCreationRequest Definition of the user-role to create. (required)
     * @return UserRoleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User role that has been created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public UserRoleResponse createUserRole(UserRoleCreationRequest userRoleCreationRequest) throws ApiException {
        ApiResponse<UserRoleResponse> localVarResp = createUserRoleWithHttpInfo(userRoleCreationRequest);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] CreateUserRole: Create a user-role
     * Creates a new user-role.
     * @param userRoleCreationRequest Definition of the user-role to create. (required)
     * @return ApiResponse&lt;UserRoleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User role that has been created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserRoleResponse> createUserRoleWithHttpInfo(UserRoleCreationRequest userRoleCreationRequest) throws ApiException {
        okhttp3.Call localVarCall = createUserRoleValidateBeforeCall(userRoleCreationRequest, null);
        Type localVarReturnType = new TypeToken<UserRoleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] CreateUserRole: Create a user-role (asynchronously)
     * Creates a new user-role.
     * @param userRoleCreationRequest Definition of the user-role to create. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User role that has been created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createUserRoleAsync(UserRoleCreationRequest userRoleCreationRequest, final ApiCallback<UserRoleResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = createUserRoleValidateBeforeCall(userRoleCreationRequest, _callback);
        Type localVarReturnType = new TypeToken<UserRoleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteUserRole
     * @param userid Id of the user-role to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserRoleCall(String userid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/userroles/{userid}"
            .replaceAll("\\{" + "userid" + "\\}", localVarApiClient.escapeString(userid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.1978");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteUserRoleValidateBeforeCall(String userid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new ApiException("Missing the required parameter 'userid' when calling deleteUserRole(Async)");
        }
        

        okhttp3.Call localVarCall = deleteUserRoleCall(userid, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] DeleteUserRole: Delete a user-role
     * Deletes an identified user-role.
     * @param userid Id of the user-role to delete. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public void deleteUserRole(String userid) throws ApiException {
        deleteUserRoleWithHttpInfo(userid);
    }

    /**
     * [EXPERIMENTAL] DeleteUserRole: Delete a user-role
     * Deletes an identified user-role.
     * @param userid Id of the user-role to delete. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteUserRoleWithHttpInfo(String userid) throws ApiException {
        okhttp3.Call localVarCall = deleteUserRoleValidateBeforeCall(userid, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * [EXPERIMENTAL] DeleteUserRole: Delete a user-role (asynchronously)
     * Deletes an identified user-role.
     * @param userid Id of the user-role to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserRoleAsync(String userid, final ApiCallback<Void> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteUserRoleValidateBeforeCall(userid, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserRole
     * @param userid Id of the user-role to get. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested user role. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserRoleCall(String userid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/userroles/{userid}"
            .replaceAll("\\{" + "userid" + "\\}", localVarApiClient.escapeString(userid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.1978");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserRoleValidateBeforeCall(String userid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new ApiException("Missing the required parameter 'userid' when calling getUserRole(Async)");
        }
        

        okhttp3.Call localVarCall = getUserRoleCall(userid, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] GetUserRole: Get a user-role
     * Get an identified user-role.
     * @param userid Id of the user-role to get. (required)
     * @return UserRoleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested user role. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public UserRoleResponse getUserRole(String userid) throws ApiException {
        ApiResponse<UserRoleResponse> localVarResp = getUserRoleWithHttpInfo(userid);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] GetUserRole: Get a user-role
     * Get an identified user-role.
     * @param userid Id of the user-role to get. (required)
     * @return ApiResponse&lt;UserRoleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested user role. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserRoleResponse> getUserRoleWithHttpInfo(String userid) throws ApiException {
        okhttp3.Call localVarCall = getUserRoleValidateBeforeCall(userid, null);
        Type localVarReturnType = new TypeToken<UserRoleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] GetUserRole: Get a user-role (asynchronously)
     * Get an identified user-role.
     * @param userid Id of the user-role to get. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested user role. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserRoleAsync(String userid, final ApiCallback<UserRoleResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = getUserRoleValidateBeforeCall(userid, _callback);
        Type localVarReturnType = new TypeToken<UserRoleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listUserRoles
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param page Optional. Encoded page string returned from a previous search result that will retrieve              the next page of data. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listUserRolesCall(Integer limit, String page, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/userroles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.1978");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listUserRolesValidateBeforeCall(Integer limit, String page, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listUserRolesCall(limit, page, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] ListUserRoles: List user-roles
     * Lists all user-roles and pages.
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param page Optional. Encoded page string returned from a previous search result that will retrieve              the next page of data. (optional)
     * @return ResourceListOfUserRoleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfUserRoleResponse listUserRoles(Integer limit, String page) throws ApiException {
        ApiResponse<ResourceListOfUserRoleResponse> localVarResp = listUserRolesWithHttpInfo(limit, page);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] ListUserRoles: List user-roles
     * Lists all user-roles and pages.
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param page Optional. Encoded page string returned from a previous search result that will retrieve              the next page of data. (optional)
     * @return ApiResponse&lt;ResourceListOfUserRoleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfUserRoleResponse> listUserRolesWithHttpInfo(Integer limit, String page) throws ApiException {
        okhttp3.Call localVarCall = listUserRolesValidateBeforeCall(limit, page, null);
        Type localVarReturnType = new TypeToken<ResourceListOfUserRoleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] ListUserRoles: List user-roles (asynchronously)
     * Lists all user-roles and pages.
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param page Optional. Encoded page string returned from a previous search result that will retrieve              the next page of data. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listUserRolesAsync(Integer limit, String page, final ApiCallback<ResourceListOfUserRoleResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = listUserRolesValidateBeforeCall(limit, page, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfUserRoleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateUserRole
     * @param userid Id of the user-role to be updated. (required)
     * @param userRoleUpdateRequest Definition of the update to apply to the user-role. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User role that has been updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateUserRoleCall(String userid, UserRoleUpdateRequest userRoleUpdateRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = userRoleUpdateRequest;

        // create path and map variables
        String localVarPath = "/api/userroles/{userid}"
            .replaceAll("\\{" + "userid" + "\\}", localVarApiClient.escapeString(userid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.0.1978");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateUserRoleValidateBeforeCall(String userid, UserRoleUpdateRequest userRoleUpdateRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new ApiException("Missing the required parameter 'userid' when calling updateUserRole(Async)");
        }
        
        // verify the required parameter 'userRoleUpdateRequest' is set
        if (userRoleUpdateRequest == null) {
            throw new ApiException("Missing the required parameter 'userRoleUpdateRequest' when calling updateUserRole(Async)");
        }
        

        okhttp3.Call localVarCall = updateUserRoleCall(userid, userRoleUpdateRequest, _callback);
        return localVarCall;

    }

    /**
     * [EXPERIMENTAL] UpdateUserRole: Update a user-role
     * Updates an identified user-role.
     * @param userid Id of the user-role to be updated. (required)
     * @param userRoleUpdateRequest Definition of the update to apply to the user-role. (required)
     * @return UserRoleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User role that has been updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public UserRoleResponse updateUserRole(String userid, UserRoleUpdateRequest userRoleUpdateRequest) throws ApiException {
        ApiResponse<UserRoleResponse> localVarResp = updateUserRoleWithHttpInfo(userid, userRoleUpdateRequest);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] UpdateUserRole: Update a user-role
     * Updates an identified user-role.
     * @param userid Id of the user-role to be updated. (required)
     * @param userRoleUpdateRequest Definition of the update to apply to the user-role. (required)
     * @return ApiResponse&lt;UserRoleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User role that has been updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserRoleResponse> updateUserRoleWithHttpInfo(String userid, UserRoleUpdateRequest userRoleUpdateRequest) throws ApiException {
        okhttp3.Call localVarCall = updateUserRoleValidateBeforeCall(userid, userRoleUpdateRequest, null);
        Type localVarReturnType = new TypeToken<UserRoleResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] UpdateUserRole: Update a user-role (asynchronously)
     * Updates an identified user-role.
     * @param userid Id of the user-role to be updated. (required)
     * @param userRoleUpdateRequest Definition of the update to apply to the user-role. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> User role that has been updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateUserRoleAsync(String userid, UserRoleUpdateRequest userRoleUpdateRequest, final ApiCallback<UserRoleResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = updateUserRoleValidateBeforeCall(userid, userRoleUpdateRequest, _callback);
        Type localVarReturnType = new TypeToken<UserRoleResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
