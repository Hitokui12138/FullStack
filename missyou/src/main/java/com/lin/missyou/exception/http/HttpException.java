package com.lin.missyou.exception.http;

/**
 * 代表一类与Http相关的异常的父类
 */
public class HttpException extends RuntimeException{
    protected Integer code;
    protected Integer httpStatusCode = 500;

    public Integer getCode() {
        return code;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

}
