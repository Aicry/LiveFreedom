package com.hms.manage.interfaces.user.api;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.user.entity.User;
import com.hms.manage.infrastructure.annotation.Log;
import com.hms.manage.interfaces.user.dto.UserDTO;
import com.hms.manage.interfaces.user.dto.UserQueryDTO;
import com.hms.manage.interfaces.user.dto.UserMenuDTO;
import jakarta.validation.Valid;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping(value = "/v1")
public interface UserAPI {

    @GetMapping("/user")
    ApiResponse<PageInfo<User>> getUser(@Param("") @Valid UserQueryDTO userDTO);

    @Log("新增用户")
    @PostMapping("/user")
    ApiResponse<Integer> addUser(@RequestBody @Valid UserDTO user);

    @Log("查询用户菜单")
    @GetMapping("/menus")
    ApiResponse<List<UserMenuDTO>> getUserMenus();
}
