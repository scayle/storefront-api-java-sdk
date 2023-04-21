package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Redirect implements ApiObjectInterface {
    /**
    * The unique identifier of the redirect
    */
    @SerializedName("id")
    Integer id;

    /**
    * The source URL for the redirect
    */
    @SerializedName("source")
    String source;

    /**
    * The target URL for the redirect
    */
    @SerializedName("target")
    String target;

    /**
    * The the status code for the redirect
    */
    @SerializedName("statusCode")
    Integer statusCode;

}