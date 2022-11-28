package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class VariantService extends AbstractService {
    public VariantService(HttpClient httpClient) {
        super(httpClient);
    }

    public VariantsResponse getByIds(List variantIds) throws ApiErrorException, ConnectionException {
        Class<VariantsResponse> responseModel = (Class<VariantsResponse>)(Class<?>)VariantsResponse.class;
            ApiOptions options = null;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            optionsBuilder.addOption("ids", variantIds.stream().map(String::valueOf).collect(Collectors.joining(",")));
            options = optionsBuilder.build();

        return this.request("get", this.resolvePath("variants"), options, responseModel);
    }
    public VariantsResponse getByIds(List variantIds, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<VariantsResponse> responseModel = (Class<VariantsResponse>)(Class<?>)VariantsResponse.class;
            ApiOptions combinedOptions = options;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            combinedOptions.getOptions().forEach(optionsBuilder::addOption);
            optionsBuilder.addOption("ids", variantIds.stream().map(String::valueOf).collect(Collectors.joining(",")));
            combinedOptions = optionsBuilder.build();

        return this.request("get", this.resolvePath("variants"), combinedOptions, responseModel);
    }
}