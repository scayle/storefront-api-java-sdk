package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreateWishlistBody implements ApiObjectInterface {
    /**
    * Variant ID to add to the wishlist.
    */
    @SerializedName("variantId")
    Integer variantId;

    /**
    * Product ID to add to the wishlist. When provided, the first found in-stock variant of the product will be added.
    */
    @SerializedName("productId")
    Integer productId;

    /**
    * `customData ` allows you to attach data to an item. The data will remain attached to the item from the basket through the process of order creation and delegation and may be displayed to the customer during the order lifecycle.

    */
    @SerializedName("customData")
    Object customData;

    /**
    * Identifier of the shop that usually refers to the child shop. In case it is missing, the request will assume the same app ID is used during the authentication.
    */
    @SerializedName("shopId")
    Integer shopId;

}