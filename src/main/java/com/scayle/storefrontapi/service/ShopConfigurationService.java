package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class ShopConfigurationService extends AbstractService {
    public ShopConfigurationService(HttpClient httpClient) {
        super(httpClient);
    }

    public ShopConfiguration suggestions(String locale) throws ApiErrorException, ConnectionException {
        Class<ShopConfiguration> responseModel = (Class<ShopConfiguration>)(Class<?>)ShopConfiguration.class;
            ApiOptions options = null;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            optionsBuilder.addOption("locale", locale);
            options = optionsBuilder.build();

        return this.request("get", this.resolvePath("shop-configuration"), options, responseModel);
    }
    public ShopConfiguration suggestions(String locale, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopConfiguration> responseModel = (Class<ShopConfiguration>)(Class<?>)ShopConfiguration.class;
            ApiOptions combinedOptions = options;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            combinedOptions.getOptions().forEach(optionsBuilder::addOption);
            optionsBuilder.addOption("locale", locale);
            combinedOptions = optionsBuilder.build();

        return this.request("get", this.resolvePath("shop-configuration"), combinedOptions, responseModel);
    }
}