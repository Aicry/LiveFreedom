package com.hms.manage.interfaces.user.api;

import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.user.entity.Role;
import com.hms.manage.infrastructure.annotation.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/19 19:40
 **/
@RequestMapping(value = "/v1")
public interface RoleAPI {

    @Log("查询用户菜单")
    @GetMapping("/role")
    ApiResponse<List<Role>> getRoles();
}
