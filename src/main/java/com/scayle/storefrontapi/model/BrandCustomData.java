package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BrandCustomData implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("floatData")
    Double floatData;

    /**
    * 
    */
    @SerializedName("localizedJson")
    List<Object> localizedJson;

    /**
    * 
    */
    @SerializedName("localizedString")
    List<Object> localizedString;

    /**
    * 
    */
    @SerializedName("nonLocalizedJson")
    String nonLocalizedJson;

    /**
    * 
    */
    @SerializedName("nonLocalizedString")
    String nonLocalizedString;

}