# AuthorizationApi

All URIs are relative to *https://staging.wellnet.tctdigital.xyz/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authSignoutPost**](AuthorizationApi.md#authSignoutPost) | **POST** /auth/signout | POST method for logout
[**authSignupPost**](AuthorizationApi.md#authSignupPost) | **POST** /auth/signup | POST method for signup action
[**authValidPost**](AuthorizationApi.md#authValidPost) | **POST** /auth/valid | POST method for validation user credentials


<a name="authSignoutPost"></a>
# **authSignoutPost**
> ResponseErrorSignUpModel authSignoutPost()

POST method for logout

Logout method  

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthorizationApi;

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    ResponseErrorSignUpModel result = apiInstance.authSignoutPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#authSignoutPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseErrorSignUpModel**](ResponseErrorSignUpModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authSignupPost"></a>
# **authSignupPost**
> ResponseSignUpModel authSignupPost(body)

POST method for signup action

Creating a new one user for WellNet 

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthorizationApi;

AuthorizationApi apiInstance = new AuthorizationApi();
RequestSignUpModel body = new RequestSignUpModel(); // RequestSignUpModel | Size of array
try {
    ResponseSignUpModel result = apiInstance.authSignupPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#authSignupPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestSignUpModel**](RequestSignUpModel.md)| Size of array |

### Return type

[**ResponseSignUpModel**](ResponseSignUpModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authValidPost"></a>
# **authValidPost**
> ResponseSignUpModel authValidPost()

POST method for validation user credentials

Validation user by Bearer 

### Example
```java
// Import classes:
//import io.swagger.client.api.AuthorizationApi;

AuthorizationApi apiInstance = new AuthorizationApi();
try {
    ResponseSignUpModel result = apiInstance.authValidPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#authValidPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseSignUpModel**](ResponseSignUpModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

