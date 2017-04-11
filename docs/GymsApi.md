# GymsApi

All URIs are relative to *https://staging.wellnet.tctdigital.xyz/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gymsPost**](GymsApi.md#gymsPost) | **POST** /gyms | get all fitness hals by location and radius


<a name="gymsPost"></a>
# **gymsPost**
> gymsPost(body)

get all fitness hals by location and radius

POST method for fetching fitnes hals

### Example
```java
// Import classes:
//import io.swagger.client.api.GymsApi;

GymsApi apiInstance = new GymsApi();
RequestGymsByCoord body = new RequestGymsByCoord(); // RequestGymsByCoord | 
try {
    apiInstance.gymsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling GymsApi#gymsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestGymsByCoord**](RequestGymsByCoord.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

