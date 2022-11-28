package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BaseCategory implements ApiObjectInterface {
    /**
    * Unique identifier of the category
    */
    @SerializedName("categoryId")
    Integer categoryId;

    /**
    * Name of the category
    */
    @SerializedName("categoryName")
    String categoryName;

    /**
    * Parent ID of the category
    */
    @SerializedName("categoryParentId")
    Integer categoryParentId;

    /**
    * Category path as text
    */
    @SerializedName("categoryPath")
    String categoryPath;

}