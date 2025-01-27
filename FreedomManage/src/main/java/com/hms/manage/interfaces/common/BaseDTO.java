package com.hms.manage.interfaces.common;

import lombok.Data;

import java.util.Date;

/**
 * @Author Hms
 * @Date 2024/05/18 22:48
 **/
@Data
public class BaseDTO {

    private Long id;

    private String enableFlag;

    private int createBy;

    private int updateBy;

    private Date createTime;

    private Date updateTime;

    private int renterId;
}
