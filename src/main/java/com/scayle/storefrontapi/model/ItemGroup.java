package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ItemGroup implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    String id;

    /**
    * 
    */
    @SerializedName("isMainItem")
    Boolean isMainItem;

    /**
    * 
    */
    @SerializedName("isRequired")
    Boolean isRequired;

}