package com.hms.manage.application.service.user;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.user.entity.User;
import com.hms.manage.domain.user.service.UserDomainService;
import com.hms.manage.interfaces.user.api.UserAPI;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.interfaces.user.converter.UserDTOToEntityConverter;
import com.hms.manage.interfaces.user.converter.UserQueryDTOToQueryConverter;
import com.hms.manage.interfaces.user.dto.UserDTO;
import com.hms.manage.interfaces.user.dto.UserQueryDTO;
import com.hms.manage.interfaces.user.dto.UserMenuDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserAppService implements UserAPI {

    @Resource
    private UserDomainService userDomainService;

    @Override
    public ApiResponse<Integer> addUser(UserDTO userDTO) {
        return ApiResponse.success(userDomainService.addUser(
                UserDTOToEntityConverter.INSTANCE.converter(userDTO)
        ));
    }

    @Override
    public ApiResponse<PageInfo<User>> getUser(UserQueryDTO userDTO) {
        return ApiResponse.success(userDomainService.getUser(
                UserQueryDTOToQueryConverter.INSTANCE.converter(userDTO)
        ));
    }

    @Override
    public ApiResponse<List<UserMenuDTO>> getUserMenus() {
        return ApiResponse.success(userDomainService.getUserMenus());
    }
}
