package com.lin.missyou.exception.http;

/**
 * 被禁用,权限不足
 */
public class ForbiddenException extends HttpException{
    public ForbiddenException(int code){
        this.httpStatusCode = 401;
        this.code = code;
    }
}
