package com.hms.livefreedom.application.service;

import com.hms.livefreedom.domain.service.IGetUserService;
import com.hms.livefreedom.domain.vo.user.User;
import com.hms.livefreedom.interfaces.IGetUserAppService;

public class GetUserAppService implements IGetUserAppService {

    private IGetUserService service;

    @Override
    public User index() {
        return service.getUser();
    }
}
