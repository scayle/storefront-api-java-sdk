package com.scayle.storefrontapi;

import com.scayle.storefrontapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class NavigationTest extends BaseApiTest {

    @Test
    public void testGetAll() throws Exception {

    ApiCollection<NavigationTree> responseEntity = this.api.navigations().getAll( null);

        String expectedResponseJson = this.loadFixture("/fixtures/NavigationGetAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (NavigationTree entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGetById() throws Exception {

    NavigationTree responseEntity = this.api.navigations().getById(1,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/NavigationGetByIdResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}