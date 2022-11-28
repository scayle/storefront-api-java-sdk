package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Filter implements ApiObjectInterface {
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
    * short text to describe the current category (usable, for example, in URLs as `fashion`).
    */
    @SerializedName("slug")
    String slug;

    /**
    * 
    */
    @SerializedName("attributeGroupType")
    String attributeGroupType;

    /**
    * 
    */
    @SerializedName("type")
    String type;

    /**
    * If type == "boolean", this field will be populated.
    */
    @SerializedName("booleanFilterValues")
    List<BooleanFilterValue> booleanFilterValues;

    /**
    * If type == "range", this field will be populated.
    */
    @SerializedName("rangeFilterValues")
    List<RangeFilterValue> rangeFilterValues;

    /**
    * If type == "attributes", this field will be populated.
    */
    @SerializedName("attributeFilterValues")
    List<AttributeFilterValue> attributeFilterValues;

    /**
    * If type == "identifier", this field will be populated.
    */
    @SerializedName("identifierFilterValue")
    List<IdentifierFilterValue> identifierFilterValue;

}