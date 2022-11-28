package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SearchSuggestions implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("brands")
    List<AttributeValue> brands;

    /**
    * 
    */
    @SerializedName("categories")
    List<Category> categories;

    /**
    * 
    */
    @SerializedName("productNames")
    List<ProductName> productNames;

    /**
    * 
    */
    @SerializedName("products")
    List<Product> products;

}