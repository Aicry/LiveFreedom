package com.hms.livefreedom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hms.livefreedom.domain.entity.SysUser;
import com.hms.livefreedom.service.SysUserService;
import com.hms.livefreedom.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author 黄明水
* @description 针对表【sys_user(系统用户)】的数据库操作Service实现
* @createDate 2023-08-16 21:44:22
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




