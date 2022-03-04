package com.mitskevich.task1.exceptions;

public class CustomCommonException extends Exception {
    public CustomCommonException(String message) {
        super(message);
    }

    public CustomCommonException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomCommonException(Throwable cause) {
        super(cause);
    }

    public CustomCommonException() {
    }
}
