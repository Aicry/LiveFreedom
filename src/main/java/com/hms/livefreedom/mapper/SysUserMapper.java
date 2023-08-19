package com.hms.livefreedom.mapper;

import com.hms.livefreedom.domain.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 黄明水
* @description 针对表【sys_user(系统用户)】的数据库操作Mapper
* @createDate 2023-08-16 21:44:22
* @Entity com.hms.livefreedom.domain.entity.SysUser
*/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}




