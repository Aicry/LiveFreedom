package com.hms.manage.application.service;

import com.hms.manage.api.LoginAPI;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.entity.SysUser;
import com.hms.manage.domain.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginAppService
 * @Author hms
 * @Date 2023/9/3 15:57
 * @Description TODO
 */
@RestController
public class LoginAppService implements LoginAPI {

    @Autowired
    private LoginService loginService;

    @Override
    public ApiResponse<String> login(SysUser sysUser) {
        return ApiResponse.success(loginService.pwdLogin(sysUser));
    }
}
