package com.scayle.storefrontapi.http;

import java.io.IOException;
import java.util.Map;
import java.util.Base64;

import com.scayle.storefrontapi.model.ApiConfiguration;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpClient {
    private OkHttpClient httpClient;
    private ApiConfiguration apiConfiguration;

    public HttpClient(ApiConfiguration apiConfiguration) {
        this.httpClient = new OkHttpClient();
        this.apiConfiguration = apiConfiguration;
    }

    public Response request(String httpMethod, String relativeUrl, Map<String, Object> options, String body) throws IOException {
        httpMethod = httpMethod.toUpperCase();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(this.apiConfiguration.getUrl() + relativeUrl).newBuilder();

        if (options != null) {
            for (String key : options.keySet()) {
                urlBuilder.addQueryParameter(key, String.valueOf(options.get(key)));
            }
        }

        RequestBody requestBody = null;
        if (body != null) {
            MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
            requestBody = RequestBody.create(body, mediaType);
        }

        Request.Builder requestBuilder = new Request.Builder()
        .header("X-Shop-Id", this.apiConfiguration.getShopId().toString())
        .header("Content-Type", "application/json")
        .header("X-SDK", "java/1.0.0")
        .url(urlBuilder.build().toString())
        .method(httpMethod, requestBody);

        String accessToken = this.apiConfiguration.getAccessToken();
        if (accessToken != null) {
            requestBuilder.header("X-Access-Token", accessToken);
        } else {
            String credentials = Base64.getEncoder().encodeToString(
                String.format(
                    "%s:%s", this.apiConfiguration.getUsername(), this.apiConfiguration.getPassword()
                ).getBytes("UTF-8")
            );
            requestBuilder.header("Authorization", String.format("Basic %s", credentials));
        }

        return httpClient.newCall(requestBuilder.build()).execute();
    }
}
