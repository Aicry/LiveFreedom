package com.hms.manage.application.service.user;

import com.github.pagehelper.PageInfo;
import com.hms.manage.domain.user.service.UserDomainService;
import com.hms.manage.interfaces.user.api.UserAPI;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.user.entity.FreedomUserT;
import com.hms.manage.interfaces.user.converter.FreedomUserDTOToEntityConverter;
import com.hms.manage.interfaces.user.converter.FreedomUserQueryDTOToQueryConverter;
import com.hms.manage.interfaces.user.dto.FreedomUserDTO;
import com.hms.manage.interfaces.user.dto.FreedomUserQueryDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserAppService implements UserAPI {

    @Resource
    private UserDomainService userDomainService;

    @Override
    public ApiResponse<Integer> addUser(FreedomUserDTO userDTO) {
        return ApiResponse.success(userDomainService.addUser(
                FreedomUserDTOToEntityConverter.INSTANCE.converter(userDTO)
        ));
    }

    @Override
    public ApiResponse<PageInfo<FreedomUserT>> getUser(FreedomUserQueryDTO userDTO) {
        return ApiResponse.success(userDomainService.getUser(
                FreedomUserQueryDTOToQueryConverter.INSTANCE.converter(userDTO)
        ));
    }
}
