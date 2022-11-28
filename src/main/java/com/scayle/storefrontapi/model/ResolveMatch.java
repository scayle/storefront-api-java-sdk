package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ResolveMatch implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("count")
    Integer count;

    /**
    * 
    */
    @SerializedName("match")
    String match;

    /**
    * 
    */
    @SerializedName("category")
    Object category;

    /**
    * 
    */
    @SerializedName("attributes")
    List<Object> attributes;

}