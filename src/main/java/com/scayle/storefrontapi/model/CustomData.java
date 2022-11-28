package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CustomData implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("value")
    String value;

    /**
    * Adjust variant price based on the specified `pricePromotionKey`. If the variant does not have a matching price promotion, the default price is returned.
    */
    @SerializedName("pricePromotionKey")
    String pricePromotionKey;

}