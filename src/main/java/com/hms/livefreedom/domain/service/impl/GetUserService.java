package com.hms.livefreedom.domain.service.impl;

import com.hms.livefreedom.domain.service.IGetUserService;
import com.hms.livefreedom.domain.vo.User;
import com.hms.livefreedom.infrastructure.dao.IGetUserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GetUserService implements IGetUserService {

    @Resource
    private IGetUserDao dao;

    @Override
    public User getUser() {
        return dao.getUser();
    }
}
