package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ShopConfiguration implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("shopId")
    Integer shopId;

    /**
    * 
    */
    @SerializedName("name")
    String name;

    /**
    * 
    */
    @SerializedName("shopCustomData")
    Map<String, CustomData> shopCustomData;

    /**
    * 
    */
    @SerializedName("properties")
    List<ShopProperties> properties;

    /**
    * 
    */
    @SerializedName("customData")
    Map<String, CustomData> customData;

    /**
    * 
    */
    @SerializedName("country")
    String country;

}