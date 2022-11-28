package com.scayle.storefrontapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Typeahead implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("suggestions")
    List<TypeaheadSuggestion> suggestions;

    /**
    * 
    */
    @SerializedName("topMatch")
    TypeaheadSuggestion topMatch;

}