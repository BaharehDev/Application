package com.example.exception;

public class NotSavedAdvertisementException extends Exception {

    public NotSavedAdvertisementException() {
    }

    public NotSavedAdvertisementException(String message) {
        super(message);
    }

    public NotSavedAdvertisementException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotSavedAdvertisementException(Throwable cause) {
        super(cause);
    }
}
