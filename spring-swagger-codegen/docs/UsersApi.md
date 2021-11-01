# UsersApi

All URIs are relative to *https://api.optube.com/user/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveUsersInfoByIds**](UsersApi.md#retrieveUsersInfoByIds) | **GET** /retrieveUsersInfoByIds | Retrieve Users Info By Ids.


<a name="retrieveUsersInfoByIds"></a>
# **retrieveUsersInfoByIds**
> RetrieveUsersInfosByIdsRespond retrieveUsersInfoByIds(retrieveUsersInfoByIdsRequest)

Retrieve Users Info By Ids.

Retrieve Users Info By Ids.

### Example
```java
// Import classes:
//import com.optube.handler.ApiException;
//import com.optube.api.UsersApi;


UsersApi apiInstance = new UsersApi();
RetrieveUsersInfoByIdsRequest retrieveUsersInfoByIdsRequest = new RetrieveUsersInfoByIdsRequest(); // RetrieveUsersInfoByIdsRequest | 
try {
    RetrieveUsersInfosByIdsRespond result = apiInstance.retrieveUsersInfoByIds(retrieveUsersInfoByIdsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#retrieveUsersInfoByIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retrieveUsersInfoByIdsRequest** | [**RetrieveUsersInfoByIdsRequest**](RetrieveUsersInfoByIdsRequest.md)|  | [optional]

### Return type

[**RetrieveUsersInfosByIdsRespond**](RetrieveUsersInfosByIdsRespond.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

