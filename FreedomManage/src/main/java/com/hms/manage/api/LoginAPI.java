package com.hms.manage.api;

import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.entity.SysUser;
import com.hms.manage.infrastructure.annotation.Log;
import org.springframework.web.bind.annotation.*;

/**
   * @ClassName LoginAPI
   * @Author hms
   * @Date 2023/9/3 15:42
   * @Description TODO
   */
@RequestMapping(value = "/login" , method = RequestMethod.POST)
public interface LoginAPI {

    @PostMapping("/login1")
    @Log("登录")
    ApiResponse<String> login(@RequestBody SysUser sysUser);
}
