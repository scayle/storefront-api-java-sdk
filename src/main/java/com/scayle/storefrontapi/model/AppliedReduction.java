package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AppliedReduction implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("amount")
    Object amount;

    /**
    * 
    */
    @SerializedName("category")
    String category;

    /**
    * 
    */
    @SerializedName("type")
    String type;

}