package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class TypeaheadService extends AbstractService {
    public TypeaheadService(HttpClient httpClient) {
        super(httpClient);
    }

    public Typeahead getSuggestions(String term) throws ApiErrorException, ConnectionException {
        Class<Typeahead> responseModel = (Class<Typeahead>)(Class<?>)Typeahead.class;
            ApiOptions options = null;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            optionsBuilder.addOption("term", term);
            options = optionsBuilder.build();

        return this.request("get", this.resolvePath("typeahead"), options, responseModel);
    }
    public Typeahead getSuggestions(String term, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Typeahead> responseModel = (Class<Typeahead>)(Class<?>)Typeahead.class;
            ApiOptions combinedOptions = options;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            combinedOptions.getOptions().forEach(optionsBuilder::addOption);
            optionsBuilder.addOption("term", term);
            combinedOptions = optionsBuilder.build();

        return this.request("get", this.resolvePath("typeahead"), combinedOptions, responseModel);
    }
    public Typeahead postSuggestions(String term, TypeaheadBody model) throws ApiErrorException, ConnectionException {
        Class<Typeahead> responseModel = (Class<Typeahead>)(Class<?>)Typeahead.class;
            ApiOptions options = null;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            optionsBuilder.addOption("term", term);
            options = optionsBuilder.build();

        return this.request("post", this.resolvePath("typeahead"), options, responseModel, model);
    }
    public Typeahead postSuggestions(String term, TypeaheadBody model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Typeahead> responseModel = (Class<Typeahead>)(Class<?>)Typeahead.class;
            ApiOptions combinedOptions = options;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            combinedOptions.getOptions().forEach(optionsBuilder::addOption);
            optionsBuilder.addOption("term", term);
            combinedOptions = optionsBuilder.build();

        return this.request("post", this.resolvePath("typeahead"), combinedOptions, responseModel, model);
    }
}