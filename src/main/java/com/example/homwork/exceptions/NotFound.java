package com.example.homwork.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class NotFound extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "Employee not found";

   public NotFound() {
       super(DEFAULT_MESSAGE);}

    public NotFound(String message) {
        super(message);
    }
    public NotFound(String message, Throwable cause) {
        super(message, cause);
    }
    public NotFound(Throwable cause) {
        super(cause);
    }
}
