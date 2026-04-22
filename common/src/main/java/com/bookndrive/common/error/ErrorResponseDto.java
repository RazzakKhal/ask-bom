package com.bookndrive.common.error;

public record ErrorResponseDto(
        String errorCode,
        String message,
        int status
) {
}

