package com.hms.livefreedom.api;

import com.hms.livefreedom.domain.common.ApiResponse;
import com.hms.livefreedom.domain.entity.SysUser;
import com.hms.livefreedom.infrastructure.annotation.Log;
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
