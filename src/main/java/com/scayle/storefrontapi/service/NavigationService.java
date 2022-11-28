package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class NavigationService extends AbstractService {
    public NavigationService(HttpClient httpClient) {
        super(httpClient);
    }

    public List<NavigationTree> getAll() throws ApiErrorException, ConnectionException {
        Class<NavigationTree> responseModel = (Class<NavigationTree>)(Class<?>)NavigationTree.class;
            ApiOptions options = null;

        return this.requestCollection("get", this.resolvePath("navigation/trees"), options, responseModel);
    }
    public NavigationTree getById(Integer navigationTreeId) throws ApiErrorException, ConnectionException {
        Class<NavigationTree> responseModel = (Class<NavigationTree>)(Class<?>)NavigationTree.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("navigation/trees/%s", navigationTreeId), options, responseModel);
    }
}