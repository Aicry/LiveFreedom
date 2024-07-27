package com.hms.manage.infrastructure.repository;

import com.hms.manage.domain.user.entity.FreedomUserT;
import com.hms.manage.domain.user.query.UserQuery;
import com.hms.manage.domain.user.repository.SysUserRepository;
import com.hms.manage.infrastructure.dao.SysUserDAO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/05/18 18:27
 **/
@Component
public class SysUserRDBRepository implements SysUserRepository {

    @Resource
    private SysUserDAO sysUserDAO;

    @Override
    public List<FreedomUserT> getUser(UserQuery userQuery) {
        return sysUserDAO.getUserByQuery(userQuery);
    }

    @Override
    public Integer addUser(FreedomUserT freedomUser) {
        return sysUserDAO.addUser(freedomUser);
    }
}
