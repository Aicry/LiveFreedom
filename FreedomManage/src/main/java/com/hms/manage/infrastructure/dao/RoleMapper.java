package com.hms.manage.infrastructure.dao;

import com.hms.manage.domain.user.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/07 21:10
 **/
@Mapper
public interface RoleMapper {
    List<Role> selectAll();
}
