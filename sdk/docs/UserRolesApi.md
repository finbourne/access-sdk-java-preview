# UserRolesApi

All URIs are relative to *https://www.lusid.com/access*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserRole**](UserRolesApi.md#createUserRole) | **POST** /api/userroles | [EXPERIMENTAL] CreateUserRole: Create a user-role
[**deleteUserRole**](UserRolesApi.md#deleteUserRole) | **DELETE** /api/userroles/{userid} | [EXPERIMENTAL] DeleteUserRole: Delete a user-role
[**getUserRole**](UserRolesApi.md#getUserRole) | **GET** /api/userroles/{userid} | [EXPERIMENTAL] GetUserRole: Get a user-role
[**listUserRoles**](UserRolesApi.md#listUserRoles) | **GET** /api/userroles | [EXPERIMENTAL] ListUserRoles: List user-roles
[**updateUserRole**](UserRolesApi.md#updateUserRole) | **POST** /api/userroles/{userid} | [EXPERIMENTAL] UpdateUserRole: Update a user-role


<a name="createUserRole"></a>
# **createUserRole**
> UserRoleResponse createUserRole(userRoleCreationRequest)

[EXPERIMENTAL] CreateUserRole: Create a user-role

Creates a new user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    UserRoleCreationRequest userRoleCreationRequest = new UserRoleCreationRequest(); // UserRoleCreationRequest | Definition of the user-role to create.
    try {
      UserRoleResponse result = apiInstance.createUserRole(userRoleCreationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#createUserRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userRoleCreationRequest** | [**UserRoleCreationRequest**](UserRoleCreationRequest.md)| Definition of the user-role to create. |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User role that has been created. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="deleteUserRole"></a>
# **deleteUserRole**
> deleteUserRole(userid)

[EXPERIMENTAL] DeleteUserRole: Delete a user-role

Deletes an identified user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    String userid = "userid_example"; // String | Id of the user-role to delete.
    try {
      apiInstance.deleteUserRole(userid);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#deleteUserRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userid** | **String**| Id of the user-role to delete. |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="getUserRole"></a>
# **getUserRole**
> UserRoleResponse getUserRole(userid)

[EXPERIMENTAL] GetUserRole: Get a user-role

Get an identified user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    String userid = "userid_example"; // String | Id of the user-role to get.
    try {
      UserRoleResponse result = apiInstance.getUserRole(userid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#getUserRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userid** | **String**| Id of the user-role to get. |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The requested user role. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="listUserRoles"></a>
# **listUserRoles**
> ResourceListOfUserRoleResponse listUserRoles(limit, page)

[EXPERIMENTAL] ListUserRoles: List user-roles

Lists all user-roles and pages.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    Integer limit = 56; // Integer | Optional. When paginating, limit the number of returned results to this many.
    String page = "page_example"; // String | Optional. Encoded page string returned from a previous search result that will retrieve              the next page of data.
    try {
      ResourceListOfUserRoleResponse result = apiInstance.listUserRoles(limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#listUserRoles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Optional. When paginating, limit the number of returned results to this many. | [optional]
 **page** | **String**| Optional. Encoded page string returned from a previous search result that will retrieve              the next page of data. | [optional]

### Return type

[**ResourceListOfUserRoleResponse**](ResourceListOfUserRoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

<a name="updateUserRole"></a>
# **updateUserRole**
> UserRoleResponse updateUserRole(userid, userRoleUpdateRequest)

[EXPERIMENTAL] UpdateUserRole: Update a user-role

Updates an identified user-role.

### Example
```java
// Import classes:
import com.finbourne.access.ApiClient;
import com.finbourne.access.ApiException;
import com.finbourne.access.Configuration;
import com.finbourne.access.auth.*;
import com.finbourne.access.models.*;
import com.finbourne.access.api.UserRolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/access");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UserRolesApi apiInstance = new UserRolesApi(defaultClient);
    String userid = "userid_example"; // String | Id of the user-role to be updated.
    UserRoleUpdateRequest userRoleUpdateRequest = new UserRoleUpdateRequest(); // UserRoleUpdateRequest | Definition of the update to apply to the user-role.
    try {
      UserRoleResponse result = apiInstance.updateUserRole(userid, userRoleUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserRolesApi#updateUserRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userid** | **String**| Id of the user-role to be updated. |
 **userRoleUpdateRequest** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md)| Definition of the update to apply to the user-role. |

### Return type

[**UserRoleResponse**](UserRoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User role that has been updated. |  -  |
**400** | The details of the input related failure |  -  |
**0** | Error response |  -  |

