package com.scayle.storefrontapi.serializer;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import com.scayle.storefrontapi.model.AttributeValue;

public class AttributeValuesAdapter implements JsonSerializer<List<AttributeValue>>, JsonDeserializer<List<AttributeValue>> {

    @Override
    public List<AttributeValue> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        List<AttributeValue> list = new ArrayList();

        if (json.isJsonObject()) {
            list.add(context.deserialize(json, AttributeValue.class));
        } else if (json.isJsonArray()) {
            JsonArray jsonArray = json.getAsJsonArray();
            jsonArray.forEach((v) -> list.add(context.deserialize(v, AttributeValue.class)));
        }

        return list;
    }

    @Override
    public JsonElement serialize(List<AttributeValue> src, Type typeOfSrc, JsonSerializationContext context) {
        return context.serialize(src);
    }
}
