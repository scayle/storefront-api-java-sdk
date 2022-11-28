package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Basket implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("items")
    List<BasketItem> items;

    /**
    * 
    */
    @SerializedName("cost")
    Price cost;

    /**
    * 
    */
    @SerializedName("packages")
    List<Package> packages;

}