package com.hms.manage.infrastructure.handler;


import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.infrastructure.exception.BizException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;


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
     * 处理入参校验异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public ApiResponse<String> exceptionHandler(HttpServletRequest req, MethodArgumentNotValidException e) {
        log.error("入参校验不通过",e);
        BindingResult bindingResult = e.getBindingResult();
        List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
        fieldErrorList.forEach(fieldError -> {
            log.info("字段：{}，message：{}",fieldError.getField(),fieldError.getDefaultMessage());
        });
        String message = fieldErrorList.getFirst().getField() +fieldErrorList.getFirst().getDefaultMessage();
        return ApiResponse.failed(500,message);
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

