package com.hms.manage.application.service.user;

import com.hms.manage.domain.user.entity.User;
import com.hms.manage.domain.user.service.LoginDomainService;
import com.hms.manage.interfaces.user.api.LoginAPI;
import com.hms.manage.domain.common.ApiResponse;
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
    private LoginDomainService loginService;

    @Override
    public ApiResponse<User> login(User sysUser) {
        return ApiResponse.success(loginService.pwdLogin(sysUser));
    }
}
