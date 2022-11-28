package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductCategory implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("categoryId")
    Integer categoryId;

    /**
    * 
    */
    @SerializedName("categoryHidden")
    Boolean categoryHidden;

    /**
    * 
    */
    @SerializedName("categoryName")
    String categoryName;

    /**
    * 
    */
    @SerializedName("categoryProperties")
    Object categoryProperties;

    /**
    * 
    */
    @SerializedName("shopLevelCustomData")
    Object shopLevelCustomData;

    /**
    * 
    */
    @SerializedName("countryLevelCustomData")
    Object countryLevelCustomData;

    /**
    * 
    */
    @SerializedName("categoryUrl")
    String categoryUrl;

    /**
    * 
    */
    @SerializedName("categorySlug")
    String categorySlug;

}