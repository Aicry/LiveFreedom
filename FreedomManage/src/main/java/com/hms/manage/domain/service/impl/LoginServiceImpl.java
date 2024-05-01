package com.hms.manage.domain.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.domain.entity.SysUser;
import com.hms.manage.domain.service.LoginService;
import com.hms.manage.infrastructure.config.JedisConnectionFactory;
import com.hms.manage.infrastructure.exception.BizException;
import com.hms.manage.infrastructure.utils.JwtUtil;
import com.hms.manage.mapper.SysUserMapper;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import redis.clients.jedis.params.SetParams;

/**
 * @ClassName LoginDomainService
 * @Author hms
 * @Date 2023/11/27 20:44
 * @Description TODO
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public String pwdLogin(SysUser sysUser) {
        SysUser user = sysUserMapper.selectById(sysUser.getUserId());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if (passwordEncoder.matches(user.getPassword(), sysUser.getPassword())) {
            String jwtToken = jwtUtil.generateJwtToken(sysUser);
            JedisConnectionFactory.set(jwtToken, user.getUserId().toString(), new SetParams().px(60000L));
            return jwtToken;
        }

        throw new BizException("账号或密码错误");
    }
}
