package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmloyeeNotFoundException extends RuntimeException{

    public EmloyeeNotFoundException() {
    }

    public EmloyeeNotFoundException(String message) {
        super(message);
    }

    public EmloyeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmloyeeNotFoundException(Throwable cause) {
        super(cause);
    }

    public EmloyeeNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
