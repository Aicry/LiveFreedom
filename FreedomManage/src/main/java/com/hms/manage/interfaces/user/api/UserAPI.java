package com.hms.manage.interfaces.user.api;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.user.entity.FreedomUserT;
import com.hms.manage.infrastructure.annotation.Log;
import com.hms.manage.interfaces.user.dto.FreedomUserDTO;
import com.hms.manage.interfaces.user.dto.FreedomUserQueryDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


@RequestMapping(value = "/userinfo")
public interface UserAPI {

    @GetMapping("/user")
    ApiResponse<PageInfo<FreedomUserT>> getUser(@RequestBody @Valid FreedomUserQueryDTO userDTO);

    @Log("新增用户")
    @PostMapping("/user")
    ApiResponse<Integer> addUser(@RequestBody @Valid FreedomUserDTO user);
}
