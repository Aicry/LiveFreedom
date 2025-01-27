package com.hms.manage.interfaces.user.api;

import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.user.entity.User;
import com.hms.manage.infrastructure.annotation.Log;
import org.springframework.web.bind.annotation.*;

/**
   * @ClassName LoginAPI
   * @Author hms
   * @Date 2023/9/3 15:42
   * @Description TODO
   */
@RequestMapping(value = "/v1")
public interface LoginAPI {

    @PostMapping("/login")
    @Log("登录")
    ApiResponse<User> login(@RequestBody User sysUser);
}
