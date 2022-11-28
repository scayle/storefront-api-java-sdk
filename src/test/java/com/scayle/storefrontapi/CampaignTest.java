package com.scayle.storefrontapi;

import com.scayle.storefrontapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class CampaignTest extends BaseApiTest {

    @Test
    public void testGetAll() throws Exception {

    CampaignsResponse responseEntity = this.api.campaigns().getAll( null);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignGetAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetById() throws Exception {

    Campaign responseEntity = this.api.campaigns().getById(1,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignGetByIdResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}