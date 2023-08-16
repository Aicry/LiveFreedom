package com.hms.livefreedom.infrastructure.dao;

import com.hms.livefreedom.domain.vo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IGetUserDao {
    User getUser();
}
