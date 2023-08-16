package com.hms.livefreedom.application.service;

import com.hms.livefreedom.domain.service.IGetUserService;
import com.hms.livefreedom.domain.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserAppService {

    @Autowired
    private IGetUserService service;

    @GetMapping("/getUser")
    public User index() {
        return service.getUser();
    }
}
