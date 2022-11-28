package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class ProductService extends AbstractService {
    public ProductService(HttpClient httpClient) {
        super(httpClient);
    }

    public Product getById(Integer productId) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("products/%s", productId), options, responseModel);
    }
    public Product getById(Integer productId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;
            ApiOptions combinedOptions = options;

        return this.request("get", this.resolvePath("products/%s", productId), combinedOptions, responseModel);
    }
    public ProductsResponse query() throws ApiErrorException, ConnectionException {
        Class<ProductsResponse> responseModel = (Class<ProductsResponse>)(Class<?>)ProductsResponse.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("products"), options, responseModel);
    }
    public ProductsResponse query(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductsResponse> responseModel = (Class<ProductsResponse>)(Class<?>)ProductsResponse.class;
            ApiOptions combinedOptions = options;

        return this.request("get", this.resolvePath("products"), combinedOptions, responseModel);
    }
}