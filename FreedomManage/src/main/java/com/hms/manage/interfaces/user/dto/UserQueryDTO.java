package com.hms.manage.interfaces.user.dto;

import com.hms.manage.interfaces.common.BaseQueryDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author Hms
 * @Date 2024/05/19 17:37
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQueryDTO extends BaseQueryDTO {

    /**
     * ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;
}
