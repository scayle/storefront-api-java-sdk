package com.scayle.storefrontapi.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

public final class ObjectParser {
    public static <T> T parse(Object object, Type type) {
        Gson gson = new Gson();
        JsonElement jsonElement = gson.toJsonTree(object);
        return gson.fromJson(jsonElement, type);
    }
}
