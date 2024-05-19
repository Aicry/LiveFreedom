package com.hms.manage.application.service.user;

import com.hms.manage.domain.user.service.LoginService;
import com.hms.manage.interfaces.user.api.LoginAPI;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.user.entity.FreedomUser;
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
    public ApiResponse<String> login(FreedomUser sysUser) {
        return ApiResponse.success(loginService.pwdLogin(sysUser));
    }
}
