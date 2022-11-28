package com.scayle.storefrontapi;

import com.scayle.storefrontapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class TypeaheadTest extends BaseApiTest {

    @Test
    public void testGetSuggestions() throws Exception {

    Typeahead responseEntity = this.api.typeaheads().getSuggestions("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/TypeaheadGetSuggestionsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testPostSuggestions() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/TypeaheadPostSuggestionsRequest.json");
        TypeaheadBody requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, TypeaheadBody.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Typeahead responseEntity = this.api.typeaheads().postSuggestions("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/TypeaheadPostSuggestionsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}