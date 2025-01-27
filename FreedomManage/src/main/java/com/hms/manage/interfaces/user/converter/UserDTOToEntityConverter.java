package com.hms.manage.interfaces.user.converter;

import com.hms.manage.domain.user.entity.User;
import com.hms.manage.interfaces.user.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author Hms
 * @Date 2024/05/18 21:58
 **/
@Mapper
public interface UserDTOToEntityConverter {

    UserDTOToEntityConverter INSTANCE = Mappers.getMapper(UserDTOToEntityConverter.class);

    User converter(UserDTO userDTO);
}
