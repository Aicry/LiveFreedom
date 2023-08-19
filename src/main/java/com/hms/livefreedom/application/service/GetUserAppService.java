package com.hms.livefreedom.application.service;

import com.hms.livefreedom.domain.entity.SysUser;
import com.hms.livefreedom.service.SysLogService;
import com.hms.livefreedom.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserAppService {

    @Autowired
    private SysLogService logService;

    @Autowired
    private SysUserService userService;

    @GetMapping("/getUser")
    public SysUser index() {
        System.out.println(userService.getById(1));
        return userService.getById(1);
    }
}
