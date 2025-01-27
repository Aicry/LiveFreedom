package com.hms.manage.infrastructure.dao;

import com.hms.manage.domain.user.entity.User;
import com.hms.manage.domain.user.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/05/18 16:51
 **/
@Mapper
public interface UserMapper {

    User selectById(@Param("param") UserQuery userQuery);

    Integer insert(@Param("param") User freedomUser);

    List<User> selectByPage(@Param("param") UserQuery userQuery);
}
