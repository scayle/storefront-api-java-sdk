package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TypeaheadBody implements ApiObjectInterface {
    /**
    * The fuzziness parameter can enable some typo tolerance. Available values are 0, 1, 2, and auto. Defaults to auto. Note: The value set in the SCAYLE  Panel will not impact this search.
    */
    @SerializedName("fuzziness")
    String fuzziness;

    /**
    * It accepts an array of objects with the keys `shopSizeRun` and `categoryShopFilterSizes`, which can boost results by the matching attribute "shopSizeRun". It can contain `BrandOrCategory` and `ProductSuggestions` as suggestions.
    */
    @SerializedName("sizes")
    List<SizeItem> sizes;

    /**
    * The `likedBrands` parameter can boost and adjust results by matching the given brand IDs.
    */
    @SerializedName("likedBrands")
    List<Integer> likedBrands;

    /**
    * The `categoryId` parameter can filter by category ID.
    */
    @SerializedName("categoryId")
    Integer categoryId;

    /**
    * The `limit` parameter allows limiting the number of suggested products returned.
    */
    @SerializedName("limit")
    Integer limit;

    /**
    * The `term` parameter allows you to query for any entity with a full or partial match with the given term.
    */
    @SerializedName("term")
    String term;

}