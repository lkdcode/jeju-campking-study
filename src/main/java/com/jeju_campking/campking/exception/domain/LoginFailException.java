package com.jeju_campking.campking.exception.domain;

import com.jeju_campking.campking.exception.CustomException;
import com.jeju_campking.campking.exception.ErrorCode;

public class LoginFailException extends CustomException {

    public LoginFailException(ErrorCode errorCode) {
        super(errorCode);
    }
}
