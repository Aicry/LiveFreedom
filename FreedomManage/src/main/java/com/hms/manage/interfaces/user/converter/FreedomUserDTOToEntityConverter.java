package com.hms.manage.interfaces.user.converter;

import com.hms.manage.domain.user.entity.FreedomUser;
import com.hms.manage.interfaces.user.dto.FreedomUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author Hms
 * @Date 2024/05/18 21:58
 **/
@Mapper
public interface FreedomUserDTOToEntityConverter {

    FreedomUserDTOToEntityConverter INSTANCE = Mappers.getMapper(FreedomUserDTOToEntityConverter.class);

    FreedomUser converter(FreedomUserDTO userDTO);
}
