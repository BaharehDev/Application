package com.example.exception;

public class ResourceNotFoundException extends RuntimeException{
    private String msg;


    public ResourceNotFoundException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
