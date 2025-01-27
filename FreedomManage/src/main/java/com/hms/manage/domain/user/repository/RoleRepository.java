package com.hms.manage.domain.user.repository;

import com.hms.manage.domain.user.entity.Role;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/07 21:05
 **/
public interface RoleRepository {
    List<Role> getRoles();
}
