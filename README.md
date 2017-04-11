# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AuthorizationApi;

public class AuthorizationApiExample {

    public static void main(String[] args) {
        AuthorizationApi apiInstance = new AuthorizationApi();
        try {
            ResponseErrorSignUpModel result = apiInstance.authSignoutPost();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthorizationApi#authSignoutPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://staging.wellnet.tctdigital.xyz/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthorizationApi* | [**authSignoutPost**](docs/AuthorizationApi.md#authSignoutPost) | **POST** /auth/signout | POST method for logout
*AuthorizationApi* | [**authSignupPost**](docs/AuthorizationApi.md#authSignupPost) | **POST** /auth/signup | POST method for signup action
*AuthorizationApi* | [**authValidPost**](docs/AuthorizationApi.md#authValidPost) | **POST** /auth/valid | POST method for validation user credentials
*DefaultApi* | [**authSigninPost**](docs/DefaultApi.md#authSigninPost) | **POST** /auth/signin | POST method for login action
*GymsApi* | [**gymsPost**](docs/GymsApi.md#gymsPost) | **POST** /gyms | get all fitness hals by location and radius


## Documentation for Models

 - [RequestGymsByCoord](docs/RequestGymsByCoord.md)
 - [RequestSignUpModel](docs/RequestSignUpModel.md)
 - [ResponseErrorSignUpModel](docs/ResponseErrorSignUpModel.md)
 - [ResponseSignUpModel](docs/ResponseSignUpModel.md)
 - [ResponseSignUpModelData](docs/ResponseSignUpModelData.md)
 - [ReuaestLoginModel](docs/ReuaestLoginModel.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



