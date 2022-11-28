package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class FilterService extends AbstractService {
    public FilterService(HttpClient httpClient) {
        super(httpClient);
    }

    public List<Filter> get() throws ApiErrorException, ConnectionException {
        Class<Filter> responseModel = (Class<Filter>)(Class<?>)Filter.class;
            ApiOptions options = null;

        return this.requestCollection("get", this.resolvePath("filters"), options, responseModel);
    }
    public List<Filter> get(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Filter> responseModel = (Class<Filter>)(Class<?>)Filter.class;
            ApiOptions combinedOptions = options;

        return this.requestCollection("get", this.resolvePath("filters"), combinedOptions, responseModel);
    }
    public List<Filter> getValues(String groupName) throws ApiErrorException, ConnectionException {
        Class<Filter> responseModel = (Class<Filter>)(Class<?>)Filter.class;
            ApiOptions options = null;

        return this.requestCollection("get", this.resolvePath("filters/%s/values", groupName), options, responseModel);
    }
    public List<Filter> getValues(String groupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Filter> responseModel = (Class<Filter>)(Class<?>)Filter.class;
            ApiOptions combinedOptions = options;

        return this.requestCollection("get", this.resolvePath("filters/%s/values", groupName), combinedOptions, responseModel);
    }
}