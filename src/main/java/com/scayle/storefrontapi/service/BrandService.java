package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class BrandService extends AbstractService {
    public BrandService(HttpClient httpClient) {
        super(httpClient);
    }

    public BrandsResponse get() throws ApiErrorException, ConnectionException {
        Class<BrandsResponse> responseModel = (Class<BrandsResponse>)(Class<?>)BrandsResponse.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("brands"), options, responseModel);
    }
    public BrandsResponse get(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<BrandsResponse> responseModel = (Class<BrandsResponse>)(Class<?>)BrandsResponse.class;
            ApiOptions combinedOptions = options;

        return this.request("get", this.resolvePath("brands"), combinedOptions, responseModel);
    }
    public BrandsResponse getById(Integer brandId) throws ApiErrorException, ConnectionException {
        Class<BrandsResponse> responseModel = (Class<BrandsResponse>)(Class<?>)BrandsResponse.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("brand/%s", brandId), options, responseModel);
    }
    public BrandsResponse getById(Integer brandId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<BrandsResponse> responseModel = (Class<BrandsResponse>)(Class<?>)BrandsResponse.class;
            ApiOptions combinedOptions = options;

        return this.request("get", this.resolvePath("brand/%s", brandId), combinedOptions, responseModel);
    }
}