package com.scayle.storefrontapi;

import com.scayle.storefrontapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class FilterTest extends BaseApiTest {

    @Test
    public void testGet() throws Exception {

    ApiCollection<Filter> responseEntity = this.api.filters().get( null);

        String expectedResponseJson = this.loadFixture("/fixtures/FilterGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Filter entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGetValues() throws Exception {

    ApiCollection<Filter> responseEntity = this.api.filters().getValues("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/FilterGetValuesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Filter entity : responseEntity.getEntities()) {
        }
    }

}