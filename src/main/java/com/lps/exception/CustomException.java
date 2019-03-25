package com.lps.exception;

/**
 * @ClassName: CustomException
 * @Description: 登录异常
 * @Author: 梁培珊
 * @Date: 14:12 2019/3/17
 **/
public class CustomException extends Exception {
    private String message;
    private String status;

    public CustomException(String message, String status) {
        super(message);
        this.message = message;
        this.status = status;
    }
    public CustomException(String message)
    {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
