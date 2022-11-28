package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;

import com.google.gson.JsonElement;

import com.scayle.storefrontapi.serializer.JsonSerializer;
import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.ApiCollection;
import com.scayle.storefrontapi.model.ApiOptions;

import okhttp3.Response;

public abstract class AbstractService {

    private HttpClient httpClient;
    private JsonSerializer jsonSerializer;

    public AbstractService(HttpClient httpClient) {
        this.httpClient = httpClient;
        this.jsonSerializer = new JsonSerializer();
    }

    protected <T> T request(String httpMethod, String relativeUrl, ApiOptions options, Class<T> modelClass) throws ApiErrorException, ConnectionException {
        return this.request(httpMethod, relativeUrl, options, modelClass, null);
    }

    protected <T> T request(String httpMethod, String relativeUrl, ApiOptions options, Class<T> modelClass, Object body) throws ApiErrorException, ConnectionException {
        try {
            Response response = this.executeRequest(httpMethod, relativeUrl, options, body);
            String responseBodyContent = response.body().string();
            Integer statusCode = response.code();

            if (statusCode >= 200 && statusCode < 300) {
                if(responseBodyContent == null || responseBodyContent.isEmpty()) {
                return null;
            }

                return this.jsonSerializer.unserializeApiObject(responseBodyContent, modelClass);
            } else {
                JsonElement errorResponse = this.jsonSerializer.unserialize(responseBodyContent, JsonElement.class);

                throw new ApiErrorException(errorResponse.getAsJsonObject(), statusCode);
            }
        } catch (ApiErrorException apiException) {
            throw apiException;
        } catch (Exception exception) {
            throw new ConnectionException(exception.getMessage(), exception);
        }
    }

    protected <T> List<T> requestCollection(String httpMethod, String relativeUrl, ApiOptions options, Class<T> modelClass) throws ApiErrorException, ConnectionException {
        return this.requestCollection(httpMethod, relativeUrl, options, modelClass, null);
    }

    protected <T> List<T> requestCollection(String httpMethod, String relativeUrl, ApiOptions options, Class<T> modelClass, Object body) throws ApiErrorException, ConnectionException {
        try {
                Response response = this.executeRequest(httpMethod, relativeUrl, options, body);
                String responseBodyContent = response.body().string();
                Integer statusCode = response.code();

                if (statusCode >= 200 && statusCode < 300) {
                    if(responseBodyContent == null || responseBodyContent.isEmpty()) {
                        return null;
                }

                    return this.jsonSerializer.unserializeList(responseBodyContent, modelClass);
                } else {
                    JsonElement errorResponse = this.jsonSerializer.unserialize(responseBodyContent, JsonElement.class);

                    throw new ApiErrorException(errorResponse.getAsJsonObject(), statusCode);
                }
            } catch (ApiErrorException apiException) {
                throw apiException;
            } catch (Exception exception) {
                throw new ConnectionException(exception.getMessage(), exception);
        }
    }

    protected String resolvePath(String path, Object... params) {
        return String.format(path, params);
    }

    private Response executeRequest(String httpMethod, String relativeUrl, ApiOptions options, Object body) throws Exception {
        String jsonRequestBody = null;
        Map<String, Object> requestOptions = null;

        if (options != null) {
            requestOptions = options.getOptions();
        }

        if (body != null) {
            jsonRequestBody = this.jsonSerializer.serializeApiObject(body);
        }

        return this.httpClient.request(httpMethod, relativeUrl, requestOptions, jsonRequestBody);
    }
}
