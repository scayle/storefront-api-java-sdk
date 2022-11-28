package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class CampaignService extends AbstractService {
    public CampaignService(HttpClient httpClient) {
        super(httpClient);
    }

    public CampaignsResponse getAll() throws ApiErrorException, ConnectionException {
        Class<CampaignsResponse> responseModel = (Class<CampaignsResponse>)(Class<?>)CampaignsResponse.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("campaigns"), options, responseModel);
    }
    public CampaignsResponse getAll(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CampaignsResponse> responseModel = (Class<CampaignsResponse>)(Class<?>)CampaignsResponse.class;
            ApiOptions combinedOptions = options;

        return this.request("get", this.resolvePath("campaigns"), combinedOptions, responseModel);
    }
    public Campaign getById(Integer campaignId) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("campaigns/%s", campaignId), options, responseModel);
    }
}