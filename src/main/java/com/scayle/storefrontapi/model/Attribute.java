package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Attribute implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * Reference that identifies the attribute
    */
    @SerializedName("key")
    String key;

    /**
    * The locale is defined by the configuration of the shop associated with the authentication token. [Translations](../../../en/next/manual/scayle/product-translations) of the individual attributes are maintained in the SCAYLE Panel.
    */
    @SerializedName("label")
    String label;

    /**
    * A flag which determines whether an attribute has a single or possibly multiple values.
    */
    @SerializedName("multiSelect")
    Boolean multiSelect;

    /**
    * Attribute type
    */
    @SerializedName("type")
    String type;

    /**
    * If 'multiSelect' is 'true', this is an 'object' ('{ id? number, label? string, value? string }'), if 'multiSelect' is 'false' this is an array of objects.
    */
    @SerializedName("values")
    List<AttributeValue> values;

}