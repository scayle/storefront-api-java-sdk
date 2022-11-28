package com.scayle.storefrontapi.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiConfiguration {
    private final String url;
    private final String accessToken;
    private final String username;
    private final String password;
    private final Integer shopId;
}