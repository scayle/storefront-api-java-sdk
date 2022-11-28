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
import com.google.gson.Gson;
import com.google.common.reflect.TypeToken;

import com.scayle.storefrontapi.model.Filter;
import com.scayle.storefrontapi.model.RangeFilterValue;
import com.scayle.storefrontapi.model.BooleanFilterValue;
import com.scayle.storefrontapi.model.AttributeFilterValue;
import com.scayle.storefrontapi.model.IdentifierFilterValue;

public class FilterAdapter implements JsonSerializer<Filter>, JsonDeserializer<Filter> {

    @Override
    public Filter deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gson = new Gson();
        JsonObject jsonObject = json.getAsJsonObject();
        JsonElement values = jsonObject.get("values");

        Filter filter = gson.fromJson(json, Filter.class);

        switch (filter.getType()) {
            case "range":
                filter.setRangeFilterValues(context.deserialize(values, new TypeToken<List<RangeFilterValue>>(){}.getType()));
                break;
            case "boolean":
                filter.setBooleanFilterValues(context.deserialize(values, new TypeToken<List<BooleanFilterValue>>(){}.getType()));
                break;
            case "attributes":
                filter.setAttributeFilterValues(context.deserialize(values, new TypeToken<List<AttributeFilterValue>>(){}.getType()));
                break;
            case "identifier":
                filter.setAttributeFilterValues(context.deserialize(values, new TypeToken<List<IdentifierFilterValue>>(){}.getType()));
                break;
        }

        return filter;
    }

    @Override
    public JsonElement serialize(Filter src, Type typeOfSrc, JsonSerializationContext context) {
        return context.serialize(src);
    }
}
