package com.hms.livefreedom.application.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hms.livefreedom.application.query.UserQuery;
import com.hms.livefreedom.domain.common.ApiResponse;
import com.hms.livefreedom.domain.entity.SysUser;
import com.hms.livefreedom.infrastructure.annotation.Log;
import com.hms.livefreedom.service.SysUserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class GetUserAppService {

    @Autowired
    private SysUserService userService;

    @PostMapping("/getUser")
    public ApiResponse<Page<SysUser>> getUser(@RequestBody UserQuery userQuery) {
        System.out.println(userQuery);
        Page<SysUser> page = new Page<>();
        page.setCurrent(userQuery.current);
        page.setSize(userQuery.size);
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        if (Strings.isNotBlank(userQuery.gender)) {
            queryWrapper.like("gender", userQuery.gender);
        }
        if (Strings.isNotBlank(userQuery.userName)) {
            queryWrapper.like("user_name", userQuery.userName);
        }
        return ApiResponse.success(userService.page(page, queryWrapper));
    }

    @Log("新增用户")
    @PostMapping("/addUser")
    public ApiResponse<String> addUser(@RequestBody SysUser user) {
        userService.save(user);
        return ApiResponse.success("");
    }

    @GetMapping("/login")
    public ApiResponse<String> login() {
        return ApiResponse.success("token");
    }
}
