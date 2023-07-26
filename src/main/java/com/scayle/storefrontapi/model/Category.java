package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Category implements ApiObjectInterface {
    /**
    * Unique identifier of the category.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Parent category, if existent and requested, using `with`.
    */
    @SerializedName("parent")
    Category parent;

    /**
    * Array of child category objects, if requested, using `with`.
The childrenIds are always included.Array of child category objects, if requested, using with.
The `childrenIds` are always included.

    */
    @SerializedName("children")
    List<Category> children;

    /**
    * child category IDs attached to the current category
    */
    @SerializedName("childrenIds")
    List<Integer> childrenIds;

    /**
    * nesting level of the category (root-level depth = 1, child nodes = 2, child nodes' children = 3, etc.)
    */
    @SerializedName("depth")
    Integer depth;

    /**
    * The category should not be shown in the front end if this is set to `true`.
    */
    @SerializedName("isHidden")
    Boolean isHidden;

    /**
    * the name of the category
    */
    @SerializedName("name")
    String name;

    /**
    * parent category ID (root-level categories have a parent ID of `0`)
    */
    @SerializedName("parentId")
    Integer parentId;

    /**
    * slugs for all `rootlineIds` combined with `/` (e.g., `/women/fashion`).
    */
    @SerializedName("path")
    String path;

    /**
    * Properties attached to this category.
    */
    @SerializedName("properties")
    List<Object> properties;

    /**
    * Contains the IDs for the path from the topmost root category to the current category, which is included as the last item.
    */
    @SerializedName("rootlineIds")
    List<Integer> rootlineIds;

    /**
    * Generated slug for the category, a short text to describe the current category (usable, for example, in URLs as `fashion`).
    */
    @SerializedName("slug")
    String slug;

    /**
    * a list of filters that can be used for filtering products in the category (for example, `armLength` or `mainMaterial`)
    */
    @SerializedName("supportedFilter")
    List<String> supportedFilter;

    /**
    * 
    */
    @SerializedName("shopLevelCustomData")
    Object shopLevelCustomData;

    /**
    * 
    */
    @SerializedName("countryLevelCustomData")
    Object countryLevelCustomData;

}