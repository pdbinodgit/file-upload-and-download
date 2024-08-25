package com.fileuploaddownload.fileuploadanddownload.customexception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException{

    private String message;

    private int code;

    private HttpStatus status;

    public CustomException( String message, int code, HttpStatus status) {

        this.message = message;
        this.code = code;
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
