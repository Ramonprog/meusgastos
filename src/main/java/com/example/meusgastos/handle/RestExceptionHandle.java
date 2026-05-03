package com.example.meusgastos.handle;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.meusgastos.common.ConvertDateTime;
import com.example.meusgastos.domain.exception.ResourceBadRequest;
import com.example.meusgastos.domain.exception.ResourceNotFoundExeption;
import com.example.meusgastos.domain.model.ResponseError;

@ControllerAdvice
public class RestExceptionHandle {
    @ExceptionHandler(ResourceNotFoundExeption.class)
    public ResponseEntity<ResponseError> handleResourceNotFoundException(ResourceNotFoundExeption ex) {
        String dateTime = ConvertDateTime.convertDate(new Date());
        ResponseError error = new ResponseError(dateTime, HttpStatus.NOT_FOUND.value(), "Not Found", ex.getMessage());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(error);
    }

    @ExceptionHandler(ResourceBadRequest.class)
    public ResponseEntity<ResponseError> ResourceBadRequest(ResourceBadRequest ex) {
        String dateTime = ConvertDateTime.convertDate(new Date());
        ResponseError error = new ResponseError(dateTime, HttpStatus.BAD_REQUEST.value(), "Bad Request",
                ex.getMessage());

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(error);
    }
}
