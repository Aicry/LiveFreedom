package com.hms.livefreedom.application.service;

import com.hms.livefreedom.domain.entity.SysUser;
import com.hms.livefreedom.infrastructure.annotation.Log;
import com.hms.livefreedom.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserAppService {

    @Autowired
    private SysUserService userService;

    @Log("查询用户")
    @GetMapping("/getUser")
    public SysUser getUserById() {
        return userService.getById(1);
    }

    @Log("新增用户")
    @PostMapping("/addUser")
    public boolean addUser(@RequestBody SysUser user) {
        return userService.save(user);
    }
}
