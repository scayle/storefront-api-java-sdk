package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Match implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("type")
    String type;

    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("name")
    String name;

    /**
    * 
    */
    @SerializedName("match")
    String match;

    /**
    * 
    */
    @SerializedName("attributeGroup")
    Object attributeGroup;

    /**
    * 
    */
    @SerializedName("attributeIds")
    List<Integer> attributeIds;

}