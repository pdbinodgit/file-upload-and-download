package com.fileuploaddownload.fileuploadanddownload.customresponse.model;

public class CustomResponse<T> {
    private String status;

    private T data;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CustomResponse( String message) {
        this.message = message;
    }
}
