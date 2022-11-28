package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class AttributeService extends AbstractService {
    public AttributeService(HttpClient httpClient) {
        super(httpClient);
    }

    public Attribute getByKey(String groupName) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("attributes/%s", groupName), options, responseModel);
    }
}