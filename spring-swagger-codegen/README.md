# spring-user-swagger-codegen-api-client

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
    <groupId>com.optube</groupId>
    <artifactId>spring-user-swagger-codegen-api-client</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.optube:spring-user-swagger-codegen-api-client:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/spring-user-swagger-codegen-api-client-0.0.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.optube.handler.*;
import com.optube.handler.auth.*;
import com.optube.model.*;
import com.optube.api.UserApi;

import java.io.File;
import java.util.*;

public class UserApiExample {

    public static void main(String[] args) {
        
        UserApi apiInstance = new UserApi();
        AddNewUserRequest addNewUserRequest = new AddNewUserRequest(); // AddNewUserRequest | 
        try {
            apiInstance.addNewUser(addNewUserRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#addNewUser");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.optube.com/user/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*UserApi* | [**addNewUser**](docs/UserApi.md#addNewUser) | **POST** /addNewUser | add a new userd details.
*UserApi* | [**deleteUser**](docs/UserApi.md#deleteUser) | **DELETE** /deleteUser | delete User details.
*UserApi* | [**getUserDetails**](docs/UserApi.md#getUserDetails) | **GET** /{userId}/getUserDetails | Retrieve user info by userId.
*UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PUT** /updateUser | update User details.
*UsersApi* | [**retrieveUsersInfoByIds**](docs/UsersApi.md#retrieveUsersInfoByIds) | **GET** /retrieveUsersInfoByIds | Retrieve Users Info By Ids.


## Documentation for Models

 - [PublicUserInfo](docs/PublicUserInfo.md)
 - [RetrieveUsersInfoByIdsRequest](docs/RetrieveUsersInfoByIdsRequest.md)
 - [RetrieveUsersInfosByIdsRespond](docs/RetrieveUsersInfosByIdsRespond.md)
 - [UserDetails](docs/UserDetails.md)
 - [AddNewUserRequest](docs/AddNewUserRequest.md)
 - [RetrieveUserInfoRespond](docs/RetrieveUserInfoRespond.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



