package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class CategoryService extends AbstractService {
    public CategoryService(HttpClient httpClient) {
        super(httpClient);
    }

    public List<Category> getRoots() throws ApiErrorException, ConnectionException {
        Class<Category> responseModel = (Class<Category>)(Class<?>)Category.class;
            ApiOptions options = null;

        return this.requestCollection("get", this.resolvePath("categories"), options, responseModel);
    }
    public List<Category> getRoots(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Category> responseModel = (Class<Category>)(Class<?>)Category.class;
            ApiOptions combinedOptions = options;

        return this.requestCollection("get", this.resolvePath("categories"), combinedOptions, responseModel);
    }
    public List<Category> getByIds(List categoryIds) throws ApiErrorException, ConnectionException {
        Class<Category> responseModel = (Class<Category>)(Class<?>)Category.class;
            ApiOptions options = null;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            optionsBuilder.addOption("ids", categoryIds.stream().map(String::valueOf).collect(Collectors.joining(",")));
            options = optionsBuilder.build();

        return this.requestCollection("get", this.resolvePath("categories"), options, responseModel);
    }
    public List<Category> getByIds(List categoryIds, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Category> responseModel = (Class<Category>)(Class<?>)Category.class;
            ApiOptions combinedOptions = options;
            ApiOptions.ApiOptionsBuilder optionsBuilder = ApiOptions.builder();
            combinedOptions.getOptions().forEach(optionsBuilder::addOption);
            optionsBuilder.addOption("ids", categoryIds.stream().map(String::valueOf).collect(Collectors.joining(",")));
            combinedOptions = optionsBuilder.build();

        return this.requestCollection("get", this.resolvePath("categories"), combinedOptions, responseModel);
    }
    public Category getById(Integer categoryId) throws ApiErrorException, ConnectionException {
        Class<Category> responseModel = (Class<Category>)(Class<?>)Category.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("categories/%s", categoryId), options, responseModel);
    }
    public Category getById(Integer categoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Category> responseModel = (Class<Category>)(Class<?>)Category.class;
            ApiOptions combinedOptions = options;

        return this.request("get", this.resolvePath("categories/%s", categoryId), combinedOptions, responseModel);
    }
    public Category getByPath(String categoryPath) throws ApiErrorException, ConnectionException {
        Class<Category> responseModel = (Class<Category>)(Class<?>)Category.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("categories/%s", categoryPath), options, responseModel);
    }
    public Category getByPath(String categoryPath, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Category> responseModel = (Class<Category>)(Class<?>)Category.class;
            ApiOptions combinedOptions = options;

        return this.request("get", this.resolvePath("categories/%s", categoryPath), combinedOptions, responseModel);
    }
}