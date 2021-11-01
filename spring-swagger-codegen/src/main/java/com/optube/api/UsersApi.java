package com.optube.api;

import com.optube.handler.ApiClient;

import com.optube.model.RetrieveUsersInfoByIdsRequest;
import com.optube.model.RetrieveUsersInfosByIdsRespond;

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
@Component("com.optube.api.UsersApi")
public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve Users Info By Ids.
     * Retrieve Users Info By Ids.
     * <p><b>200</b> - A JSON of RetrieveUsersInfosByIdsRespond
     * <p><b>400</b> - error 400
     * <p><b>401</b> - error 401
     * <p><b>404</b> - error 404
     * <p><b>0</b> - error 500
     * @param retrieveUsersInfoByIdsRequest The retrieveUsersInfoByIdsRequest parameter
     * @return RetrieveUsersInfosByIdsRespond
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RetrieveUsersInfosByIdsRespond retrieveUsersInfoByIds(RetrieveUsersInfoByIdsRequest retrieveUsersInfoByIdsRequest) throws RestClientException {
        Object postBody = retrieveUsersInfoByIdsRequest;
        
        String path = UriComponentsBuilder.fromPath("/retrieveUsersInfoByIds").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<RetrieveUsersInfosByIdsRespond> returnType = new ParameterizedTypeReference<RetrieveUsersInfosByIdsRespond>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
