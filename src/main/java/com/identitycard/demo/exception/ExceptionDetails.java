package com.identitycard.demo.exception;

import java.time.LocalDateTime;

public class ExceptionDetails {
    private LocalDateTime time;
    private String message;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
