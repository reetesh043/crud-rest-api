package com.crud.rest.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    private static final long serialVersionUID = 6171978443681353425L;

    private ErrorDetails errorDetails;

    public BadRequestException(ErrorDetails errorDetails, String message, Throwable cause) {
        super(message, cause);
        this.errorDetails = errorDetails;
    }

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

}
