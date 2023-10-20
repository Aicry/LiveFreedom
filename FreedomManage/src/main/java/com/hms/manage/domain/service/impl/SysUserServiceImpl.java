package com.hms.manage.domain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hms.manage.application.query.UserQuery;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.entity.SysUser;
import com.hms.manage.domain.service.SysUserService;
import com.hms.manage.mapper.SysUserMapper;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

/**
* @author Hms
* @description 针对表【sys_user(系统用户)】的数据库操作Service实现
* @createDate 2023-09-02 21:20:28
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

    @Override
    public ApiResponse<Page<SysUser>> getUser(UserQuery userQuery) {
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
        return ApiResponse.success(page(page, queryWrapper));
    }
}




