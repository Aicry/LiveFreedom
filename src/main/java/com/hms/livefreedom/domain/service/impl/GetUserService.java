package com.hms.livefreedom.domain.service.impl;

import com.hms.livefreedom.domain.service.IGetUserService;
import com.hms.livefreedom.domain.vo.user.User;
import com.hms.livefreedom.infrastructure.dao.IGetUserDao;

public class GetUserService implements IGetUserService {
    private IGetUserDao dao;
    @Override
    public User getUser() {
        return dao.getUser();
    }
}
