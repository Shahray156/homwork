package com.example.homwork.exceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)

public class EmployeeExceptions  extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Employee book is full";
    public EmployeeExceptions() {
        this(DEFAULT_MESSAGE);
    }
    public EmployeeExceptions(String messenge) {
        super(messenge);
    }
}
