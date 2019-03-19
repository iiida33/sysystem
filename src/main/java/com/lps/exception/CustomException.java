package com.lps.exception;

/**
 * @ClassName: CustomException
 * @Description: 登录异常
 * @Author: 梁培珊
 * @Date: 14:12 2019/3/17
 **/
public class CustomException extends Exception {
    private String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
