package com.example.entity.base;

public enum ErrorCode {
    Success(0, "success"),
    Error(-101, "请稍后重试"),
    ServerUnstable(-101, "请联系管理员"),
    ThirdServiceUnstable(-202, "底层服务异常，请联系管理员"),
    NO_PERMISSION(-401, "无权限");

    int value;
    String message;
    ErrorCode(int value, String message){
        this.value = value;
        this.message = message;
    }

    public int getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }
}
