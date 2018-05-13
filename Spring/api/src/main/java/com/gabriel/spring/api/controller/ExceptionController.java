package com.gabriel.spring.api.controller;

import com.gabriel.spring.api.error.StandardError;
import org.hibernate.ObjectDeletedException;
import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFoundException(ObjectNotFoundException e, HttpServletRequest request) {
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        StandardError error = new StandardError(httpStatus, e.getMessage(), System.currentTimeMillis());

        return ResponseEntity.status(httpStatus).body(error);
    }

    @ExceptionHandler(ObjectDeletedException.class)
    public ResponseEntity<StandardError> objectDeletedException(ObjectDeletedException e, HttpServletRequest request) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        StandardError error = new StandardError(httpStatus, e.getMessage(), System.currentTimeMillis());

        return ResponseEntity.status(httpStatus).body(error);
    }
}
