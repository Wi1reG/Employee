package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmloyeeAlreadyAddedException extends RuntimeException{

    public EmloyeeAlreadyAddedException() {
    }

    public EmloyeeAlreadyAddedException(String message) {
        super(message);
    }

    public EmloyeeAlreadyAddedException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmloyeeAlreadyAddedException(Throwable cause) {
        super(cause);
    }

    public EmloyeeAlreadyAddedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
