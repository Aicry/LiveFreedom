package com.hms.manage.interfaces.user.converter;

import com.hms.manage.domain.user.query.UserQuery;
import com.hms.manage.interfaces.user.dto.UserQueryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author Hms
 * @Date 2024/05/18 19:30
 **/
@Mapper
public interface UserQueryDTOToQueryConverter {

    UserQueryDTOToQueryConverter INSTANCE = Mappers.getMapper(UserQueryDTOToQueryConverter.class);

    UserQuery converter(UserQueryDTO userDTO);
}
