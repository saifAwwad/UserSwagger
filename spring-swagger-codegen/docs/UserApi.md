# UserApi

All URIs are relative to *https://api.optube.com/user/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewUser**](UserApi.md#addNewUser) | **POST** /addNewUser | add a new userd details.
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /deleteUser | delete User details.
[**getUserDetails**](UserApi.md#getUserDetails) | **GET** /{userId}/getUserDetails | Retrieve user info by userId.
[**updateUser**](UserApi.md#updateUser) | **PUT** /updateUser | update User details.


<a name="addNewUser"></a>
# **addNewUser**
> addNewUser(addNewUserRequest)

add a new userd details.

add a new userd details.

### Example
```java
// Import classes:
//import com.optube.handler.ApiException;
//import com.optube.api.UserApi;


UserApi apiInstance = new UserApi();
AddNewUserRequest addNewUserRequest = new AddNewUserRequest(); // AddNewUserRequest | 
try {
    apiInstance.addNewUser(addNewUserRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addNewUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addNewUserRequest** | [**AddNewUserRequest**](AddNewUserRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser()

delete User details.

delete User details.

### Example
```java
// Import classes:
//import com.optube.handler.ApiException;
//import com.optube.api.UserApi;


UserApi apiInstance = new UserApi();
try {
    apiInstance.deleteUser();
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUserDetails"></a>
# **getUserDetails**
> RetrieveUserInfoRespond getUserDetails(userId)

Retrieve user info by userId.

Retrieve user info by userId.

### Example
```java
// Import classes:
//import com.optube.handler.ApiException;
//import com.optube.api.UserApi;


UserApi apiInstance = new UserApi();
String userId = "userId_example"; // String | the userId.
try {
    RetrieveUserInfoRespond result = apiInstance.getUserDetails(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| the userId. |

### Return type

[**RetrieveUserInfoRespond**](RetrieveUserInfoRespond.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateUser"></a>
# **updateUser**
> updateUser(updateUserRequest)

update User details.

update User details.

### Example
```java
// Import classes:
//import com.optube.handler.ApiException;
//import com.optube.api.UserApi;


UserApi apiInstance = new UserApi();
UpdateUserRequest updateUserRequest = new UpdateUserRequest(); // UpdateUserRequest | 
try {
    apiInstance.updateUser(updateUserRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

