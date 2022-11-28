package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class Product implements ApiObjectInterface {
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
    @SerializedName("attributes")
    Map<String, Attribute> attributes;

    /**
    * 
    */
    @SerializedName("baseCategories")
    List<BaseCategory> baseCategories;

    /**
    * 
    */
    @SerializedName("categories")
    List<ProductCategory> categories;

    /**
    * 
    */
    @SerializedName("definingAttributes")
    DefiningAttribute definingAttributes;

    /**
    * 
    */
    @SerializedName("images")
    List<Image> images;

    /**
    * 
    */
    @SerializedName("customData")
    Map<String, CustomData> customData;

    /**
    * Identifies whether a product is active or not
    */
    @SerializedName("isActive")
    Boolean isActive;

    /**
    * Identifies whether a product is new or not
    */
    @SerializedName("isNew")
    Boolean isNew;

    /**
    * Identifies if a product is still available to sell
    */
    @SerializedName("isSoldOut")
    Boolean isSoldOut;

    /**
    * Identifies the master product which this product belongs
    */
    @SerializedName("masterKey")
    String masterKey;

    /**
    * Identifies the first time one of the products variants went live
    */
    @SerializedName("firstLiveAt")
    String firstLiveAt;

    /**
    * 
    */
    @SerializedName("pricePromotionInfo")
    Object pricePromotionInfo;

    /**
    * 
    */
    @SerializedName("priceRange")
    PriceRange priceRange;

    /**
    * 
    */
    @SerializedName("reductionRange")
    ReductionRange reductionRange;

    /**
    * 
    */
    @SerializedName("lowestPriorPrice")
    LowestPriorPrice lowestPriorPrice;

    /**
    * 
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * 
    */
    @SerializedName("searchCategoryIds")
    List<Integer> searchCategoryIds;

    /**
    * list of Products
    */
    @SerializedName("siblings")
    List<Product> siblings;

    /**
    * 
    */
    @SerializedName("variants")
    List<Variant> variants;

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