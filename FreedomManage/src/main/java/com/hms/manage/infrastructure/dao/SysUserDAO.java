package com.hms.manage.infrastructure.dao;

import com.hms.manage.domain.user.entity.FreedomUser;
import com.hms.manage.domain.user.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/05/18 16:51
 **/
@Mapper
public interface SysUserDAO {

    List<FreedomUser> getUserByQuery(UserQuery userQuery);

    Integer addUser(@Param("param") FreedomUser freedomUser);
}
