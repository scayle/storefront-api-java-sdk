package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Stock implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("deliveryForecast")
    Object deliveryForecast;

    /**
    * 
    */
    @SerializedName("isSellableWithoutStock")
    Boolean isSellableWithoutStock;

    /**
    * 
    */
    @SerializedName("quantity")
    Integer quantity;

    /**
    * 
    */
    @SerializedName("warehouseId")
    Integer warehouseId;

    /**
    * 
    */
    @SerializedName("supplierId")
    Integer supplierId;

}