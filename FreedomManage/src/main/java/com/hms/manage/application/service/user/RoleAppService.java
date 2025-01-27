package com.hms.manage.application.service.user;

import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.user.entity.Role;
import com.hms.manage.domain.user.service.RoleDomainService;
import com.hms.manage.interfaces.user.api.RoleAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/19 19:42
 **/
@RestController
public class RoleAppService implements RoleAPI {

    @Autowired
    private RoleDomainService roleDomainService;

    @Override
    public ApiResponse<List<Role>> getRoles() {
        return ApiResponse.success(roleDomainService.getRoles());
    }
}
