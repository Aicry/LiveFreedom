package com.hms.manage.application.service;

import com.hms.manage.api.LoginAPI;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.entity.SysUser;
import com.hms.manage.infrastructure.utils.JwtUtil;
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
    private JwtUtil jwtUtil;

    @Override
    public ApiResponse<String> login(SysUser sysUser) {

        String s = jwtUtil.generateJwtToken(sysUser);
        return ApiResponse.success(s);
    }
}
