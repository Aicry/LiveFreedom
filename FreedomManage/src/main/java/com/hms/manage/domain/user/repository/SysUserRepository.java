package com.hms.manage.domain.user.repository;

import com.hms.manage.domain.user.entity.FreedomUserT;
import com.hms.manage.domain.user.query.UserQuery;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/05/18 18:25
 **/
public interface SysUserRepository {
    List<FreedomUserT> getUser(UserQuery userQuery);

    Integer addUser(FreedomUserT freedomUser);
}
