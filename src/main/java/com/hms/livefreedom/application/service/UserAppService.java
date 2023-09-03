package com.hms.livefreedom.application.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hms.livefreedom.api.UserAPI;
import com.hms.livefreedom.application.query.UserQuery;
import com.hms.livefreedom.domain.common.ApiResponse;
import com.hms.livefreedom.domain.entity.SysUser;
import com.hms.livefreedom.domain.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserAppService implements UserAPI {

    @Autowired
    private SysUserService userService;

    public ApiResponse<Page<SysUser>> getUser(@RequestBody UserQuery userQuery) {
        return userService.getUser(userQuery);
    }

    /**
     * @param user:
     * @return ApiResponse<String>
     * @author Hms
     * @description TODO
     * @date 2023/9/3 15:55
     */
    public ApiResponse<String> addUser(@RequestBody SysUser user) {
        userService.save(user);
        return ApiResponse.success("");
    }
}
