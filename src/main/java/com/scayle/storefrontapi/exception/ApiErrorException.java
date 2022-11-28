package com.scayle.storefrontapi.exception;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Iterables;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class ApiErrorException extends RuntimeException {
    private List<ApiError> errors;
    private Integer statusCode;

    public ApiErrorException(JsonObject errorResponse, Integer statusCode) {
        this.statusCode = statusCode;
        this.errors = this.parseErrorResponse(errorResponse);
    }

    public ApiError getFirstError() {
        return Iterables.getLast(this.errors);
    }

    public List<ApiError> getErrors() {
        return this.errors;
    }

    private List<ApiError> parseErrorResponse(JsonObject errorResponse) {
        List<ApiError> errors = new ArrayList<>();
        JsonPrimitive errorKeyPrimitive = errorResponse.getAsJsonPrimitive("code");
        String errorKey = errorKeyPrimitive == null ? String.valueOf(this.statusCode) : errorKeyPrimitive.getAsString();
        JsonPrimitive messagePrimitive = errorResponse.getAsJsonPrimitive("message");
        String message = messagePrimitive == null ? "" : messagePrimitive.getAsString();
        ApiError apiError = new ApiError(errorKey, message, "");
        errors.add(apiError);

        return errors;
    }
}
