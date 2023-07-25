package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class Brand implements ApiObjectInterface {
    /**
    * The unique identifier of the brand (referred as `attributeId`), can be used for retrieving specific brand. ID which would be used to filter for brands in the `products` and `filters` endpoint
    */
    @SerializedName("id")
    Integer id;

    /**
    * short text to describe the current category (usable, for example, in URLs as `fashion`).
    */
    @SerializedName("slug")
    String slug;

    /**
    * 
    */
    @SerializedName("name")
    String name;

    /**
    * Arbitrary custom data object to be added to the brand.
    */
    @SerializedName("customData")
    BrandCustomData customData;

    /**
    * External reference set by the client to integrate a third-party party system.
    */
    @SerializedName("externalReference")
    String externalReference;

    /**
    * Brand group.
    */
    @SerializedName("group")
    String group;

    /**
    * Whether the brand is currently active or not.
    */
    @SerializedName("isActive")
    Boolean isActive;

    /**
    * Logo hash used for generating the full url.
    */
    @SerializedName("logoHash")
    String logoHash;

    /**
    * Date string of creation, formatted according to RFC 3339.
    */
    @SerializedName("createdAt")
    OffsetDateTime createdAt;

    /**
    * Date string of last update, formatted according to RFC 3339.
    */
    @SerializedName("updatedAt")
    OffsetDateTime updatedAt;

    /**
    * Date string of last update, formatted according to RFC 3339.
    */
    @SerializedName("indexedAt")
    Timestamp indexedAt;

}