package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Pagination implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("current")
    Integer current;

    /**
    * 
    */
    @SerializedName("first")
    Integer first;

    /**
    * 
    */
    @SerializedName("last")
    Integer last;

    /**
    * 
    */
    @SerializedName("next")
    Integer next;

    /**
    * 
    */
    @SerializedName("page")
    Integer page;

    /**
    * 
    */
    @SerializedName("perPage")
    Integer perPage;

    /**
    * 
    */
    @SerializedName("prev")
    Integer prev;

    /**
    * 
    */
    @SerializedName("total")
    Integer total;

}