package com.jeju_campking.campking.exception;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonPropertyOrder({"errorCode", "message"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse<T> {
    private ErrorCode errorCode;
    private String message;
    private T payload;

    public ErrorResponse(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.message = errorCode.getMessage();
        this.payload = null;
    }



}
