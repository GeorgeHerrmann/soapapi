package com.georgster.soapapi;

public class ApiError {
    private String errorMessage;

    public ApiError(String message) {
        errorMessage = message;
    }

    public String getMessage() {
        return errorMessage;
    }
}
