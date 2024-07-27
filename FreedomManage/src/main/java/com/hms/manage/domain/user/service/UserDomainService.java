package com.hms.manage.domain.user.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.user.entity.FreedomUserT;
import com.hms.manage.domain.user.query.UserQuery;
import com.hms.manage.domain.user.repository.SysUserRepository;
import com.hms.manage.infrastructure.config.SnowflakeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public PageInfo<FreedomUserT> getUser(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPageNumber(), userQuery.getPageSize());
        List<FreedomUserT> list =  sysUserRepository.getUser(userQuery);
        PageInfo<FreedomUserT> page = new PageInfo<>(list, userQuery.getPageNumber());
        return page;
    }

    public Integer addUser(FreedomUserT freedomUser) {
        freedomUser.setUserId(snowflake.next());
        return sysUserRepository.addUser(freedomUser);
    }
}




