# DefaultApi

All URIs are relative to *https://staging.wellnet.tctdigital.xyz/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authSigninPost**](DefaultApi.md#authSigninPost) | **POST** /auth/signin | POST method for login action


<a name="authSigninPost"></a>
# **authSigninPost**
> ReuaestLoginModel authSigninPost(body)

POST method for login action

Login to system 

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
ResponseSignUpModel body = new ResponseSignUpModel(); // ResponseSignUpModel | Size of array
try {
    ReuaestLoginModel result = apiInstance.authSigninPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authSigninPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResponseSignUpModel**](ResponseSignUpModel.md)| Size of array |

### Return type

[**ReuaestLoginModel**](ReuaestLoginModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

