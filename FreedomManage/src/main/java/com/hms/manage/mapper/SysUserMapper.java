package com.hms.manage.mapper;

import com.hms.manage.domain.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Hms
* @description 针对表【sys_user(系统用户)】的数据库操作Mapper
* @createDate 2023-09-02 21:20:28
* @Entity com.hms.livefreedom.domain.entity.SysUser
*/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}




