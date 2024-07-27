package com.hms.manage.interfaces.user.api;

import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.user.entity.FreedomUserT;
import com.hms.manage.infrastructure.annotation.Log;
import org.springframework.web.bind.annotation.*;

/**
   * @ClassName LoginAPI
   * @Author hms
   * @Date 2023/9/3 15:42
   * @Description TODO
   */
@RequestMapping(value = "/login")
public interface LoginAPI {

    @PostMapping("/login1")
    @Log("登录")
    ApiResponse<String> login(@RequestBody FreedomUserT sysUser);
}
