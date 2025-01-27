package com.hms.manage.infrastructure.repository;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.user.entity.User;
import com.hms.manage.domain.user.query.UserQuery;
import com.hms.manage.domain.user.repository.UserRepository;
import com.hms.manage.infrastructure.dao.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/05/18 18:27
 **/
@Repository
public class UserRDBRepository implements UserRepository {

    @Resource
    private UserMapper sysUserDAO;

    @Override
    public User getUser(UserQuery userQuery) {
        return sysUserDAO.selectById(userQuery);
    }

    @Override
    public PageInfo<User> getUsers(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getCurrent(), userQuery.getSize());
        List<User> list =  sysUserDAO.selectByPage(userQuery);
        return new PageInfo<>(list);
    }

    @Override
    public Integer addUser(User freedomUser) {
        return sysUserDAO.insert(freedomUser);
    }
}
