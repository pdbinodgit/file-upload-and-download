package com.fileuploaddownload.fileuploadanddownload.customexception;

import com.fileuploaddownload.fileuploadanddownload.customresponse.model.CustomResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<CustomResponse<?>> customException(CustomException customException, WebRequest request){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new CustomResponse<>(customException.getMessage()));
    }


}
