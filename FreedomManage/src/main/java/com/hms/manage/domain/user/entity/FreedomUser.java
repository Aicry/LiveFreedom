package com.hms.manage.domain.user.entity;

import java.io.Serializable;
import java.util.Date;

import com.hms.manage.domain.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class FreedomUser extends BaseEntity implements Serializable {
    /**
     * ID
     */

    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

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