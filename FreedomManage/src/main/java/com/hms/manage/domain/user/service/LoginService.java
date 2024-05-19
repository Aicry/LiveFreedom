package com.hms.manage.domain.user.service;

import com.hms.manage.domain.user.entity.FreedomUser;
import com.hms.manage.domain.user.query.UserQuery;
import com.hms.manage.infrastructure.config.JedisConnectionFactory;
import com.hms.manage.infrastructure.exception.BizException;
import com.hms.manage.infrastructure.utils.JwtUtil;
import com.hms.manage.infrastructure.dao.SysUserDAO;
import jakarta.annotation.Resource;
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
public class LoginService{

    @Autowired
    private JwtUtil jwtUtil;

    @Resource
    private SysUserDAO sysUserDao;

    public String pwdLogin(FreedomUser sysUser) {
        FreedomUser user = sysUserDao.getUserByQuery(new UserQuery()).getFirst();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if (passwordEncoder.matches(user.getPassword(), sysUser.getPassword())) {
            String jwtToken = jwtUtil.generateJwtToken(sysUser);
            JedisConnectionFactory.set(jwtToken, user.getUserId().toString(), new SetParams().px(60000L));
            return jwtToken;
        }
        throw new BizException("账号或密码错误");
    }
}
