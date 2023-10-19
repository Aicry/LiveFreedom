package com.hms.livefreedom.api;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hms.livefreedom.application.query.UserQuery;
import com.hms.livefreedom.domain.common.ApiResponse;
import com.hms.livefreedom.domain.entity.SysUser;
import com.hms.livefreedom.infrastructure.annotation.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/user",method = RequestMethod.POST)
public interface UserAPI {

    @PostMapping("/getUser")
    ApiResponse<Page<SysUser>> getUser(@RequestBody UserQuery userQuery);

    @Log("新增用户")
    @PostMapping("/addUser")
    ApiResponse<String> addUser(@RequestBody SysUser user);
}
