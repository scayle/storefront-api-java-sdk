package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Campaign implements ApiObjectInterface {
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
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("description")
    String description;

    /**
    * 
    */
    @SerializedName("reduction")
    Integer reduction;

    /**
    * 
    */
    @SerializedName("customData")
    Object customData;

    /**
    * 
    */
    @SerializedName("start_at")
    String start_at;

    /**
    * 
    */
    @SerializedName("end_at")
    String end_at;

}