package com.hms.manage.infrastructure.dao;

/**
 * @Author Hms
 * @Date 2024/11/06 22:10
 **/

import com.hms.manage.domain.user.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MenuMapper {

    List<Menu> listMenusByUserInfoId(Long userInfoId);
}
