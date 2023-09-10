package com.example.test_task_sibdigital.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ArrayNotFoundExceptionHandler {

    @ExceptionHandler(value = {ArrayNotFoundException.class})
    protected ResponseEntity<Object> handleArrayNotFoundException(ArrayNotFoundException e) {
        ArrayNotFoundException arrayNotFoundException = new ArrayNotFoundException(e.getMessage());
        return new ResponseEntity<>(arrayNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }
}
