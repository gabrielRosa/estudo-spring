package com.gabriel.spring.api.error;


import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class StandardError implements Serializable {

    private static final long serialVersionUID = 8123544297413346209L;

    private HttpStatus httpStatus;
    private String message;
    private Long timeStamp;

    public StandardError(HttpStatus httpStatus, String message, Long timeStamp) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
