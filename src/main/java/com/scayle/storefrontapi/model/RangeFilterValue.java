package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RangeFilterValue implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("max")
    Integer max;

    /**
    * 
    */
    @SerializedName("min")
    Integer min;

    /**
    * 
    */
    @SerializedName("productCount")
    Integer productCount;

}