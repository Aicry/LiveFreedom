package com.hms.manage.infrastructure.exception;


import com.hms.manage.infrastructure.enums.ResponseCode;

public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public int code;

    public int getCode() {
        return code == 0 ? 400 : code;
    }

    public BizException() {
        super();
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(ResponseCode responseCode) {
        super(responseCode.getMessage());
        this.code = responseCode.getCode();
    }

    public BizException(ResponseCode responseCode, Throwable cause) {
        super(String.valueOf(responseCode.getCode()), cause);
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}

