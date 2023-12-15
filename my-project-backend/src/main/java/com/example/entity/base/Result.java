package com.example.entity.base;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import lombok.Data;

@Data
public class Result<T> {
    private int code = ErrorCode.Success.getValue();
    private String message = ErrorCode.Success.getMessage();
    private T data;

    public Result(){}
    public Result(T data){ this.data = data; }

    public Result(int code, String message, T data){
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    public Result(T data, String message){
        this.setMessage(message);
        this.data = data;
    }

    public static <T> Result<T> success(T data){
        return new Result<>(data);
    }

    public static <T> Result<T> error(int code, String message, T data){ return new Result<>(code, message, data); }

    public String toJsonString() {
        return JSONObject.toJSONString(this, JSONWriter.Feature.WriteNulls);
    }
}
