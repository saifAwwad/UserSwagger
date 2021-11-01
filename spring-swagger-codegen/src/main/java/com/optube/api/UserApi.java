package com.optube.api;

import com.optube.handler.ApiClient;

import com.optube.model.AddNewUserRequest;
import com.optube.model.RetrieveUserInfoRespond;
import com.optube.model.UpdateUserRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-01T20:13:50.454+02:00")
@Component("com.optube.api.UserApi")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * add a new userd details.
     * add a new userd details.
     * <p><b>200</b> - No Output Body
     * <p><b>400</b> - error 400
     * <p><b>401</b> - error 401
     * <p><b>404</b> - error 404
     * <p><b>0</b> - error 500
     * @param addNewUserRequest The addNewUserRequest parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addNewUser(AddNewUserRequest addNewUserRequest) throws RestClientException {
        Object postBody = addNewUserRequest;
        
        String path = UriComponentsBuilder.fromPath("/addNewUser").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * delete User details.
     * delete User details.
     * <p><b>200</b> - No Output Body, 200 is success
     * <p><b>400</b> - error 400
     * <p><b>401</b> - error 401
     * <p><b>404</b> - error 404
     * <p><b>0</b> - error 500
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteUser() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/deleteUser").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve user info by userId.
     * Retrieve user info by userId.
     * <p><b>200</b> - A JSON of RetrieveUserInfoRespond
     * <p><b>400</b> - error 400
     * <p><b>401</b> - error 401
     * <p><b>404</b> - error 404
     * <p><b>0</b> - error 500
     * @param userId the userId.
     * @return RetrieveUserInfoRespond
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RetrieveUserInfoRespond getUserDetails(String userId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        String path = UriComponentsBuilder.fromPath("/{userId}/getUserDetails").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<RetrieveUserInfoRespond> returnType = new ParameterizedTypeReference<RetrieveUserInfoRespond>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * update User details.
     * update User details.
     * <p><b>200</b> - No Output Body
     * <p><b>400</b> - error 400
     * <p><b>401</b> - error 401
     * <p><b>404</b> - error 404
     * <p><b>0</b> - error 500
     * @param updateUserRequest The updateUserRequest parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateUser(UpdateUserRequest updateUserRequest) throws RestClientException {
        Object postBody = updateUserRequest;
        
        String path = UriComponentsBuilder.fromPath("/updateUser").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
