package com.scayle.storefrontapi;

import com.scayle.storefrontapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ProductTest extends BaseApiTest {

    @Test
    public void testGetById() throws Exception {

    Product responseEntity = this.api.products().getById(1,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductGetByIdResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testQuery() throws Exception {

    ProductsResponse responseEntity = this.api.products().query( null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductQueryResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}