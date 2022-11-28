package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductSuggestion implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("product")
    Product product;

    /**
    * 
    */
    @SerializedName("score")
    Double score;

    /**
    * 
    */
    @SerializedName("type")
    String type;

}