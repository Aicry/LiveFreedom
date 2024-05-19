package com.hms.manage.domain.user.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hms.manage.domain.user.entity.FreedomUser;
import com.hms.manage.domain.user.query.UserQuery;
import com.hms.manage.domain.user.repository.SysUserRepository;
import com.hms.manage.infrastructure.config.SnowflakeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Hms
* @description 针对表freedom_user_t
* @createDate 2023-09-02 21:20:28
*/
@Service
public class UserDomainService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Autowired
    private SnowflakeGenerator snowflake;

    public Page<FreedomUser> getUser(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPageNumber(), userQuery.getPageSize());
        Page<FreedomUser> list = (Page<FreedomUser>) sysUserRepository.getUser(userQuery);
        System.out.println(STR."listCnt:\{list.getTotal()}");
        return list;
    }

    public Integer addUser(FreedomUser freedomUser) {
        freedomUser.setUserId(snowflake.next());
        return sysUserRepository.addUser(freedomUser);
    }
}




