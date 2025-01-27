package com.hms.manage.infrastructure.enums;

import lombok.Getter;

/**
 * @Author Hms
 * @Date 2024/11/20 21:42
 **/
@Getter
public enum Flag {

    N(0, "N"),
    Y(1, "Y");

    private final int code;
    private final String message;

    Flag(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
