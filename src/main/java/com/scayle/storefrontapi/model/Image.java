package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Image implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("attributes")
    Map<String, Attribute> attributes;

    /**
    * 
    */
    @SerializedName("hash")
    String hash;

}