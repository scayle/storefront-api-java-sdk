package com.scayle.storefrontapi.serializer;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import java.time.OffsetDateTime;

import com.scayle.storefrontapi.model.ApiCollection;
import com.scayle.storefrontapi.model.AttributeValue;
import com.scayle.storefrontapi.model.Filter;
import com.scayle.storefrontapi.polymorphism.Polymorphic;
import com.scayle.storefrontapi.polymorphism.PolymorphicAdapter;
import com.scayle.storefrontapi.polymorphism.PolymorphicInterface;
import com.scayle.storefrontapi.polymorphism.PolymorphicMapping;
import com.scayle.storefrontapi.serializer.AttributeValuesAdapter;
import com.scayle.storefrontapi.serializer.FilterAdapter;
import com.scayle.storefrontapi.serializer.TimestampAdapter;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;

public class JsonSerializer {

    private Polymorphic polymorphic;

    public JsonSerializer() {
        this.polymorphic = new Polymorphic();
    }

public <T> T unserializeApiObject(String json, Class<T> modelClass) {
    Gson gson = this.createGson(modelClass);

    return (T)(gson.fromJson(json, modelClass));
    }

    public <T> ApiCollection<T> unserializeApiCollection(String json, Class<T> modelClass) {
        Gson gson = this.createGson(modelClass);

        return (ApiCollection<T>)(gson.fromJson(json, getType(ApiCollection.class, modelClass)));
    }

    public <T> T unserialize(String json, Class<T> clazz) {
        Gson gson = new Gson();

        return (T)(gson.fromJson(json, clazz));
    }

    public <T> List<T> unserializeList(String json, Class<T> clazz) {
        Gson gson = this.createGson(clazz);
        Type listType = new TypeToken<List<T>>(){}.getType();

        return (List<T>)(gson.fromJson(json, getType(List.class, clazz)));
    }

    public String serializeApiObject(Object apiObject) {
        Gson gson = new Gson();

        return gson.toJson(apiObject);
    }

    private <T> Gson createGson(Class<T> modelClass) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        // Dont cast int/long to doubles
        gsonBuilder.registerTypeAdapter(new TypeToken<Map <String, Object>>(){}.getType(),  new MapNumberAdapter());
        // Parse Timestamp objects from string to OffsetDateTime class
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, new TimestampAdapter());
        //Parse polymorphic array/object AttributeValues to array
        gsonBuilder.registerTypeAdapter(new TypeToken<List<AttributeValue>>(){}.getType(), new AttributeValuesAdapter());

        //Parse polymorphic FilterValues to separate fields
        gsonBuilder.registerTypeAdapter(Filter.class, new FilterAdapter());

        if (this.polymorphic.hasClassMapping(modelClass)) {
            for (Class<?> interfaceClass : this.polymorphic.getMappingForClass(modelClass).keySet()) {
                PolymorphicMapping mapping = this.polymorphic.getMappingForClass(modelClass).get(interfaceClass);
                gsonBuilder.registerTypeAdapter(interfaceClass, new PolymorphicAdapter<PolymorphicInterface>(mapping.getDiscriminator(), mapping.getMapping()));
            }
        }

        return gsonBuilder.create();
    }

    private Type getType(final Class<?> rawClass, final Class<?> parameterClass) {
        return new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return new Type[]{parameterClass};
            }

            @Override
            public Type getRawType() {
                return rawClass;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }

        };
    }
}
