package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Cost implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("appliedReductions")
    List<AppliedReduction> appliedReductions;

    /**
    * The currency of the price.
    */
    @SerializedName("currencyCode")
    String currencyCode;

    /**
    * 
    */
    @SerializedName("withoutTax")
    Integer withoutTax;

    /**
    * 
    */
    @SerializedName("withTax")
    Integer withTax;

}