package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BrandOrCategorySuggestion implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("attributeFilters")
    List<Object> attributeFilters;

    /**
    * 
    */
    @SerializedName("brand")
    Object brand;

    /**
    * 
    */
    @SerializedName("category")
    Category category;

    /**
    * 
    */
    @SerializedName("primaryMatch")
    String primaryMatch;

    /**
    * 
    */
    @SerializedName("productCount")
    Integer productCount;

    /**
    * 
    */
    @SerializedName("suggestion")
    String suggestion;

}