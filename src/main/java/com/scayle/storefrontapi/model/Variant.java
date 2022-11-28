package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class Variant implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("advancedAttributes")
    Map<String, AdvancedAttribute> advancedAttributes;

    /**
    * 
    */
    @SerializedName("appliedPricePromotionKey")
    String appliedPricePromotionKey;

    /**
    * 
    */
    @SerializedName("attributes")
    Map<String, Attribute> attributes;

    /**
    * 
    */
    @SerializedName("price")
    Price price;

    /**
    * 
    */
    @SerializedName("productId")
    Integer productId;

    /**
    * 
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * Identifies the first time the variant went live
    */
    @SerializedName("firstLiveAt")
    String firstLiveAt;

    /**
    * 
    */
    @SerializedName("stock")
    Stock stock;

    /**
    * 
    */
    @SerializedName("customData")
    Map<String, CustomData> customData;

    /**
    * 
    */
    @SerializedName("createdAt")
    OffsetDateTime createdAt;

    /**
    * 
    */
    @SerializedName("updatedAt")
    OffsetDateTime updatedAt;

}