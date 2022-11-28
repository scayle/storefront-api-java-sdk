package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CampaignsResponse implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("pagination")
    Pagination pagination;

    /**
    * 
    */
    @SerializedName("entities")
    List<Campaign> entities;

}