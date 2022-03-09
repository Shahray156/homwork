package com.example.homwork.exceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExistsException extends RuntimeException {
    public ExistsException() {
        super("Employee Book already contains this employee.");

    }

    public ExistsException(String message) {
        super(message);
    }

    public ExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExistsException(Throwable cause) {
        super(cause);
    }
}
