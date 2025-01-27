package com.hms.manage.interfaces.user.dto;

import com.hms.manage.interfaces.common.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

/**
 * @Author Hms
 * @Date 2024/05/18 19:32
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class UserDTO extends BaseDTO {

    private List<String> userNameList;

    /**
     * ID
     */

    private String userId;

    /**
     * 用户名
     */
    private String userName;

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
