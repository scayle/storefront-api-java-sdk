package com.scayle.storefrontapi;

import com.scayle.storefrontapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class WishlistTest extends BaseApiTest {

    @Test
    public void testAddItem() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/WishlistAddItemRequest.json");
        CreateWishlistBody requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CreateWishlistBody.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Wishlist responseEntity = this.api.wishlists().addItem("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/WishlistAddItemResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

    Wishlist responseEntity = this.api.wishlists().get("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/WishlistGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testRemove() throws Exception {

    Wishlist responseEntity = this.api.wishlists().remove("1", "1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/WishlistRemoveResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}