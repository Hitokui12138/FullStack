package com.lin.missyou.exception.http;

/**
 * 继承通用HTTPException
 */
public class NotFoundException extends HttpException{
    public NotFoundException(int code){
        this.httpStatusCode = 404;
        this.code = code;
    }
}
