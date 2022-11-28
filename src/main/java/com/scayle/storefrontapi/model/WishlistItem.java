package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WishlistItem implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("packageId")
    Integer packageId;

    /**
    * 
    */
    @SerializedName("quantity")
    Integer quantity;

    /**
    * 
    */
    @SerializedName("status")
    String status;

    /**
    * 
    */
    @SerializedName("product")
    Product product;

    /**
    * 
    */
    @SerializedName("variant")
    Variant variant;

    /**
    * 
    */
    @SerializedName("productId")
    String productId;

    /**
    * 
    */
    @SerializedName("masterKey")
    String masterKey;

    /**
    * 
    */
    @SerializedName("variantId")
    String variantId;

    /**
    * 
    */
    @SerializedName("customData")
    Map<String, CustomData> customData;

}