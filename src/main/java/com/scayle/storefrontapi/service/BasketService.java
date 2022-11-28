package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class BasketService extends AbstractService {
    public BasketService(HttpClient httpClient) {
        super(httpClient);
    }

    public Basket addItem(String basketId, CreateBasketBody model) throws ApiErrorException, ConnectionException {
        Class<Basket> responseModel = (Class<Basket>)(Class<?>)Basket.class;
            ApiOptions options = null;

        return this.request("post", this.resolvePath("baskets/%s/items", basketId), options, responseModel, model);
    }
    public Basket addItem(String basketId, CreateBasketBody model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Basket> responseModel = (Class<Basket>)(Class<?>)Basket.class;
            ApiOptions combinedOptions = options;

        return this.request("post", this.resolvePath("baskets/%s/items", basketId), combinedOptions, responseModel, model);
    }
    public Basket get(String basketId) throws ApiErrorException, ConnectionException {
        Class<Basket> responseModel = (Class<Basket>)(Class<?>)Basket.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("baskets/%s", basketId), options, responseModel);
    }
    public Basket get(String basketId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Basket> responseModel = (Class<Basket>)(Class<?>)Basket.class;
            ApiOptions combinedOptions = options;

        return this.request("get", this.resolvePath("baskets/%s", basketId), combinedOptions, responseModel);
    }
    public Basket remove(String basketId, String itemKey) throws ApiErrorException, ConnectionException {
        Class<Basket> responseModel = (Class<Basket>)(Class<?>)Basket.class;
            ApiOptions options = null;

        return this.request("delete", this.resolvePath("baskets/%s/items/%s", basketId, itemKey), options, responseModel);
    }
    public Basket remove(String basketId, String itemKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Basket> responseModel = (Class<Basket>)(Class<?>)Basket.class;
            ApiOptions combinedOptions = options;

        return this.request("delete", this.resolvePath("baskets/%s/items/%s", basketId, itemKey), combinedOptions, responseModel);
    }
    public Basket update(String basketId, String itemKey, CreateBasketBody model) throws ApiErrorException, ConnectionException {
        Class<Basket> responseModel = (Class<Basket>)(Class<?>)Basket.class;
            ApiOptions options = null;

        return this.request("patch", this.resolvePath("baskets/%s/items/%s", basketId, itemKey), options, responseModel, model);
    }
    public Basket update(String basketId, String itemKey, CreateBasketBody model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Basket> responseModel = (Class<Basket>)(Class<?>)Basket.class;
            ApiOptions combinedOptions = options;

        return this.request("patch", this.resolvePath("baskets/%s/items/%s", basketId, itemKey), combinedOptions, responseModel, model);
    }
}