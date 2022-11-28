package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class SearchService extends AbstractService {
    public SearchService(HttpClient httpClient) {
        super(httpClient);
    }

    public SearchSuggestions suggestions(String term) throws ApiErrorException, ConnectionException {
        Class<SearchSuggestions> responseModel = (Class<SearchSuggestions>)(Class<?>)SearchSuggestions.class;
            ApiOptions options = null;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            optionsBuilder.addOption("term", term);
            options = optionsBuilder.build();

        return this.request("get", this.resolvePath("search/suggestions"), options, responseModel);
    }
    public SearchSuggestions suggestions(String term, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<SearchSuggestions> responseModel = (Class<SearchSuggestions>)(Class<?>)SearchSuggestions.class;
            ApiOptions combinedOptions = options;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            combinedOptions.getOptions().forEach(optionsBuilder::addOption);
            optionsBuilder.addOption("term", term);
            combinedOptions = optionsBuilder.build();

        return this.request("get", this.resolvePath("search/suggestions"), combinedOptions, responseModel);
    }
}