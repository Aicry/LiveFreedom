package com.hms.manage.domain.common;

import com.hms.manage.infrastructure.enums.ResponseCode;
import lombok.Data;

@Data
public class ApiResponse<T> {
    private final String code;
    private final String message;
    private final T data;

    // 省略构造方法和Getter/Setter

    public ApiResponse(ResponseCode responseCode, T data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
    }

    public ApiResponse(String code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<T>(ResponseCode.SUCCESS, data);
    }

    public static <T> ApiResponse<T> failed(T data) {
        return new ApiResponse<T>(ResponseCode.INTERNAL_SERVER_ERROR, null); // data为null
    }

    public static <T> ApiResponse<T> failed(String code, String message) {
        return new ApiResponse<T>(code, message); // data为null
    }
}