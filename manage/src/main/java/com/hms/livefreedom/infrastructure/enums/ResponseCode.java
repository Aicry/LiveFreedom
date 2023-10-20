package com.hms.livefreedom.infrastructure.enums;

public enum ResponseCode {
    SUCCESS("200", "请求成功"),
    INVALID_INPUT("400", "无效的输入"),
    UNAUTHORIZED("401", "未经授权"),
    NOT_FOUND("404", "未找到"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误");

    private final String code;
    private final String message;

    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

