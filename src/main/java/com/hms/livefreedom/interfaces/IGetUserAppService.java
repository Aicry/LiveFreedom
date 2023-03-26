package com.hms.livefreedom.interfaces;

import com.hms.livefreedom.domain.vo.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface IGetUserAppService {
    @GetMapping("/get")
    User index();
}
