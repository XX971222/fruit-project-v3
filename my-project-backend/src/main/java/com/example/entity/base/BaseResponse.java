package com.example.entity.base;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseResponse {
    private int code = ErrorCode.Success.getValue();
    private Object data;
    private String message = ErrorCode.Success.getMessage();

    public static BaseResponse generate(ErrorCode errorCode){
        return BaseResponse.builder().code(errorCode.getValue()).message(errorCode.getMessage()).build();
    }
}
