package com.scayle.storefrontapi;

import com.scayle.storefrontapi.exception.InvalidArgumentException;
import com.scayle.storefrontapi.factory.ServiceFactory;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.ApiConfiguration;

public abstract class AbstractApiClient {
    protected ApiConfiguration apiConfiguration;
    private ServiceFactory serviceFactory;

    public AbstractApiClient(ApiConfiguration apiConfiguration) {
        this.validateConfig(apiConfiguration);

        this.apiConfiguration = apiConfiguration;
        this.serviceFactory = new ServiceFactory(new HttpClient(apiConfiguration));
    }

    protected <T> T getService(String className) {
        return this.serviceFactory.getService(className);
    }

    /**
    *
    * @param apiConfiguration
    * @throws InvalidArgumentException
    */
    private void validateConfig(ApiConfiguration apiConfiguration) throws InvalidArgumentException {
        String url = apiConfiguration.getUrl();
        String accessToken = apiConfiguration.getAccessToken();
        String username = apiConfiguration.getUsername();
        String password = apiConfiguration.getPassword();
        Integer shopId = apiConfiguration.getShopId();

        if (url == null || url.isEmpty()) {
            throw new InvalidArgumentException("A valid API Url has to be set");
        }

        if ((accessToken == null || accessToken.isEmpty()) && (username == null || username.isEmpty() || password == null || password.isEmpty())) {
            throw new InvalidArgumentException("A valid accessToken or username and password have to be set");
        }

        if (shopId == null) {
            throw new InvalidArgumentException("A valid shopId has to be set");
        }
    }
}