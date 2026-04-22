package com.bookndrive.common.error;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiException extends RuntimeException {

    private String errorCode;
    private int status;

    public ApiException(String message, String errorCode, int status) {

        super(message);
        this.errorCode = errorCode;
        this.status = status;
    }
}
