package com.identitycard.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> getExceptionDetail(Exception ex){
        ExceptionDetails details = new ExceptionDetails();
        details.setTime(LocalDateTime.now());
        details.setMessage(ex.getMessage());
        return new ResponseEntity<>(details, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
