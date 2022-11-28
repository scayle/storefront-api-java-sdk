package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreateBasketBody implements ApiObjectInterface {
    /**
    * For each item, you can add an additional custom data array. This will not change the API behavior. The data will remain attached to the basket item and you may retrieve it at any time during or after the checkout and order process.

    */
    @SerializedName("customData")
    Object customData;

    /**
    * Custom basket item properties for display during SCAYLE  checkout and order process can be set with displayData.
    */
    @SerializedName("displayData")
    Object displayData;

    /**
    * The quantity for the variant.

    */
    @SerializedName("quantity")
    Integer quantity;

    /**
    * If you are operating multiple shops (for example, for different domain names or different languages), each shop is identified by its specific `shopId`.

    */
    @SerializedName("shopId")
    Integer shopId;

    /**
    * The variant to be added to the basket. This is the only required parameter.
    */
    @SerializedName("variantId")
    Integer variantId;

}