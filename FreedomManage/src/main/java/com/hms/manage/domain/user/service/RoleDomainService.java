package com.hms.manage.domain.user.service;

import com.hms.manage.domain.user.entity.Role;
import com.hms.manage.domain.user.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/19 19:42
 **/
@Service
public class RoleDomainService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getRoles() {
        return roleRepository.getRoles();
    }
}
