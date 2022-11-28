package com.scayle.storefrontapi;

import com.scayle.storefrontapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ShopConfigurationTest extends BaseApiTest {

    @Test
    public void testSuggestions() throws Exception {

    ShopConfiguration responseEntity = this.api.shopConfigurations().suggestions("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopConfigurationSuggestionsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}