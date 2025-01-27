package com.hms.manage.domain.user.entity;

import java.util.Date;

import com.hms.manage.domain.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BaseEntity {
    /**
     * ID
     */

    private String userId;

    /**
     * 用户名
     */
    private String userName;

    private String roleName;

    private String token;

    private Date pwdResetTime;

    /**
     * 头像地址
     */
    private String avatarName;

    /**
     * 头像真实路径
     */
    private String avatarPath;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否为admin账号
     */
    private String isAdmin;
}