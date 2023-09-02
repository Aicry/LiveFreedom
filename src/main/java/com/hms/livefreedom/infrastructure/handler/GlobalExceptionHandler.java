package com.hms.livefreedom.infrastructure.handler;


import com.hms.livefreedom.domain.common.ApiResponse;
import com.hms.livefreedom.infrastructure.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 处理自定义的业务异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public ApiResponse<String> bizExceptionHandler(HttpServletRequest req, BizException e) {
        log.error(e.getMessage());
        return ApiResponse.failed(e.getCode(), e.getMessage());
    }

    /**
     * 处理空指针的异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ApiResponse<String> exceptionHandler(HttpServletRequest req, NullPointerException e) {
        log.error(e.getMessage());
        return ApiResponse.failed(e.getMessage());
    }


    /**
     * 处理其他异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResponse<String> exceptionHandler(HttpServletRequest req, Exception e) {
        log.error(e.getMessage());
        return ApiResponse.failed(e.getMessage());
    }
}

