package com.scayle.storefrontapi.service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

import com.scayle.storefrontapi.exception.ApiErrorException;
import com.scayle.storefrontapi.exception.ConnectionException;
import com.scayle.storefrontapi.http.HttpClient;
import com.scayle.storefrontapi.model.*;

@SuppressWarnings("unchecked")
public class WishlistService extends AbstractService {
    public WishlistService(HttpClient httpClient) {
        super(httpClient);
    }

    public Wishlist addItem(String wishlistId, CreateWishlistBody model) throws ApiErrorException, ConnectionException {
        Class<Wishlist> responseModel = (Class<Wishlist>)(Class<?>)Wishlist.class;
            ApiOptions options = null;

        return this.request("post", this.resolvePath("wishlists/%s/items", wishlistId), options, responseModel, model);
    }
    public Wishlist addItem(String wishlistId, CreateWishlistBody model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Wishlist> responseModel = (Class<Wishlist>)(Class<?>)Wishlist.class;
            ApiOptions combinedOptions = options;

        return this.request("post", this.resolvePath("wishlists/%s/items", wishlistId), combinedOptions, responseModel, model);
    }
    public Wishlist get(String wishlistId) throws ApiErrorException, ConnectionException {
        Class<Wishlist> responseModel = (Class<Wishlist>)(Class<?>)Wishlist.class;
            ApiOptions options = null;

        return this.request("get", this.resolvePath("wishlists/%s", wishlistId), options, responseModel);
    }
    public Wishlist get(String wishlistId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Wishlist> responseModel = (Class<Wishlist>)(Class<?>)Wishlist.class;
            ApiOptions combinedOptions = options;

        return this.request("get", this.resolvePath("wishlists/%s", wishlistId), combinedOptions, responseModel);
    }
    public Wishlist remove(String wishlistId, String itemKey) throws ApiErrorException, ConnectionException {
        Class<Wishlist> responseModel = (Class<Wishlist>)(Class<?>)Wishlist.class;
            ApiOptions options = null;

        return this.request("delete", this.resolvePath("wishlists/%s/items/%s", wishlistId, itemKey), options, responseModel);
    }
    public Wishlist remove(String wishlistId, String itemKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Wishlist> responseModel = (Class<Wishlist>)(Class<?>)Wishlist.class;
            ApiOptions combinedOptions = options;

        return this.request("delete", this.resolvePath("wishlists/%s/items/%s", wishlistId, itemKey), combinedOptions, responseModel);
    }
}