package com.scayle.storefrontapi;

import com.scayle.storefrontapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class BasketTest extends BaseApiTest {

    @Test
    public void testAddItem() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/BasketAddItemRequest.json");
        CreateBasketBody requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CreateBasketBody.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Basket responseEntity = this.api.baskets().addItem("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/BasketAddItemResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

    Basket responseEntity = this.api.baskets().get("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/BasketGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testRemove() throws Exception {

    Basket responseEntity = this.api.baskets().remove("1", "1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/BasketRemoveResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/BasketUpdateRequest.json");
        CreateBasketBody requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CreateBasketBody.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Basket responseEntity = this.api.baskets().update("1", "1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/BasketUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}