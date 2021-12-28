package com.iuyun.open.exception;

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -8195693180711596127L;

    private int code;

    public String message;

    public BusinessException() {
    }

    public BusinessException(String msg) {
        super(msg);
        this.message=msg;
    }

    public BusinessException(int erroCode, String msg) {
        super(msg);
        this.message=msg;
        this.code = erroCode;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(int erroCode, String message, Throwable cause) {
        super(message, cause);
        this.message=message;
        this.code = erroCode;
    }

    public BusinessException(int erroCode, Throwable cause) {
        super(cause);
        this.code = erroCode;
    }

    public BusinessException(int erroCode, Exception exception) {
        super(exception);
        this.code = erroCode;
    }

    public BusinessException(Exception exception) {
        super(exception);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
