package com.hms.manage.infrastructure.repository;

import com.hms.manage.domain.user.entity.Role;
import com.hms.manage.domain.user.repository.RoleRepository;
import com.hms.manage.infrastructure.dao.RoleMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/07 21:03
 **/
@Repository
public class RoleRDBRepository implements RoleRepository {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public List<Role> getRoles() {
        return roleMapper.selectAll();
    }
}
