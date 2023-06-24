package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundAdvertisementException extends Throwable {

    public NotFoundAdvertisementException(){
        super();
    }

    public NotFoundAdvertisementException(String message, Throwable cause){
        super(message, cause);
    }

    public NotFoundAdvertisementException(String message){
        super(message);
    }

    public NotFoundAdvertisementException(Throwable cause){
        super(cause);
    }
}
