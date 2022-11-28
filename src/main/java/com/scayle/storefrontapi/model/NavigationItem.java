package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class NavigationItem implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("assets")
    List<String> assets;

    /**
    * 
    */
    @SerializedName("name")
    String name;

    /**
    * 
    */
    @SerializedName("type")
    String type;

    /**
    * 
    */
    @SerializedName("visibleFrom")
    String visibleFrom;

    /**
    * 
    */
    @SerializedName("visibleTo")
    String visibleTo;

    /**
    * 
    */
    @SerializedName("options")
    Object options;

    /**
    * 
    */
    @SerializedName("children")
    List<NavigationItem> children;

}