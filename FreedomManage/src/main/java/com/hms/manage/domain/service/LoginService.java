package com.hms.manage.domain.service;

import com.hms.manage.domain.entity.SysUser;

/**
 * @ClassName LoginService
 * @Author hms
 * @Date 2023/11/27 20:55
 * @Description TODO
 */
public interface LoginService {
    String pwdLogin(SysUser sysUser);
}
