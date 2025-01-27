package com.hms.manage.domain.user.repository;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.user.entity.User;
import com.hms.manage.domain.user.query.UserQuery;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/05/18 18:25
 **/
public interface UserRepository {
    User getUser(UserQuery userQuery);

    PageInfo<User> getUsers(UserQuery userQuery);

    Integer addUser(User freedomUser);
}
