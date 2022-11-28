package com.scayle.storefrontapi;

import com.scayle.storefrontapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class CategoryTest extends BaseApiTest {

    @Test
    public void testGetRoots() throws Exception {

    ApiCollection<Category> responseEntity = this.api.categories().getRoots( null);

        String expectedResponseJson = this.loadFixture("/fixtures/CategoryGetRootsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Category entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGetByIds() throws Exception {

    ApiCollection<Category> responseEntity = this.api.categories().getByIds("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CategoryGetByIdsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Category entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGetById() throws Exception {

    Category responseEntity = this.api.categories().getById(1,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CategoryGetByIdResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetByPath() throws Exception {

    Category responseEntity = this.api.categories().getByPath("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CategoryGetByPathResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}