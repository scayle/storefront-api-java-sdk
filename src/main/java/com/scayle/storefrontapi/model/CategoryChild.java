package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CategoryChild implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("parent")
    Category parent;

    /**
    * 
    */
    @SerializedName("children")
    List<CategoryChild> children;

    /**
    * 
    */
    @SerializedName("childrenIds")
    List<Integer> childrenIds;

    /**
    * 
    */
    @SerializedName("depth")
    Integer depth;

    /**
    * 
    */
    @SerializedName("description")
    String description;

    /**
    * 
    */
    @SerializedName("isHidden")
    Boolean isHidden;

    /**
    * 
    */
    @SerializedName("name")
    String name;

    /**
    * 
    */
    @SerializedName("parentId")
    Integer parentId;

    /**
    * 
    */
    @SerializedName("path")
    String path;

    /**
    * 
    */
    @SerializedName("properties")
    List<Object> properties;

    /**
    * 
    */
    @SerializedName("rootlineIds")
    List<Integer> rootlineIds;

    /**
    * short text to describe the current category (usable, for example, in URLs as `fashion`).
    */
    @SerializedName("slug")
    String slug;

    /**
    * 
    */
    @SerializedName("supportedFilter")
    List<String> supportedFilter;

}