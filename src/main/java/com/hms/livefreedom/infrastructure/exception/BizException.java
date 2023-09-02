package com.hms.livefreedom.infrastructure.exception;


import com.hms.livefreedom.infrastructure.enums.ResponseCode;

public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public String code;

    public String getCode() {
        return code == null ? "400" : code;
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
        super(responseCode.getCode(), cause);
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}

