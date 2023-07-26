package com.PermissionBasedAuthorizationSystem.PBAS.exceptions;


import org.springframework.http.HttpStatus;

public class PBASAPIException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public PBASAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public PBASAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}