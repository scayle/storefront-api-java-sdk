package com.scayle.storefrontapi;

import com.scayle.storefrontapi.model.ApiConfiguration;
import com.scayle.storefrontapi.service.AttributeService;
import com.scayle.storefrontapi.service.BrandService;
import com.scayle.storefrontapi.service.CategoryService;
import com.scayle.storefrontapi.service.FilterService;
import com.scayle.storefrontapi.service.CampaignService;
import com.scayle.storefrontapi.service.NavigationService;
import com.scayle.storefrontapi.service.ProductService;
import com.scayle.storefrontapi.service.SearchService;
import com.scayle.storefrontapi.service.ShopConfigurationService;
import com.scayle.storefrontapi.service.TypeaheadService;
import com.scayle.storefrontapi.service.VariantService;
import com.scayle.storefrontapi.service.WishlistService;
import com.scayle.storefrontapi.service.BasketService;

public final class StorefrontClient extends AbstractApiClient {

    public StorefrontClient(ApiConfiguration apiConfiguration) {
        super(apiConfiguration);
    }

    public AttributeService attributes() {
        AttributeService service = this.getService("com.scayle.storefrontapi.service.AttributeService");
        return service;
    }

    public BrandService brands() {
        BrandService service = this.getService("com.scayle.storefrontapi.service.BrandService");
        return service;
    }

    public CategoryService categories() {
        CategoryService service = this.getService("com.scayle.storefrontapi.service.CategoryService");
        return service;
    }

    public FilterService filters() {
        FilterService service = this.getService("com.scayle.storefrontapi.service.FilterService");
        return service;
    }

    public CampaignService campaign() {
        CampaignService service = this.getService("com.scayle.storefrontapi.service.CampaignService");
        return service;
    }

    public NavigationService navigation() {
        NavigationService service = this.getService("com.scayle.storefrontapi.service.NavigationService");
        return service;
    }

    public ProductService products() {
        ProductService service = this.getService("com.scayle.storefrontapi.service.ProductService");
        return service;
    }

    public SearchService search() {
        SearchService service = this.getService("com.scayle.storefrontapi.service.SearchService");
        return service;
    }

    public ShopConfigurationService shopConfigurations() {
        ShopConfigurationService service = this.getService("com.scayle.storefrontapi.service.ShopConfigurationService");
        return service;
    }

    public TypeaheadService typeahead() {
        TypeaheadService service = this.getService("com.scayle.storefrontapi.service.TypeaheadService");
        return service;
    }

    public VariantService variants() {
        VariantService service = this.getService("com.scayle.storefrontapi.service.VariantService");
        return service;
    }

    public WishlistService wishlists() {
        WishlistService service = this.getService("com.scayle.storefrontapi.service.WishlistService");
        return service;
    }

    public BasketService baskets() {
        BasketService service = this.getService("com.scayle.storefrontapi.service.BasketService");
        return service;
    }

}