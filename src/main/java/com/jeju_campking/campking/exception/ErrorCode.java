package com.jeju_campking.campking.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;


@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    LOGIN_ERROR(HttpStatus.BAD_REQUEST, "Login_error");
    private final HttpStatus httpStatus;
    private final String message;
}
