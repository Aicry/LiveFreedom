package com.hms.manage.domain.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hms.manage.application.query.UserQuery;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Hms
* @description 针对表【sys_user(系统用户)】的数据库操作Service
* @createDate 2023-09-02 21:20:28
*/
public interface SysUserService extends IService<SysUser> {

    ApiResponse<Page<SysUser>> getUser(UserQuery userQuery);
}
