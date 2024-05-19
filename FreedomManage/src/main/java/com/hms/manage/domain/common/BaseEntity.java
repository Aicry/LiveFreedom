package com.hms.manage.domain.common;

import lombok.Data;

import java.util.Date;

/**
 * @Author Hms
 * @Date 2024/05/18 21:35
 **/
@Data
public class BaseEntity {

    private String enableFlag;

    private int createBy;

    private int updateBy;

    private Date createTime;

    private Date updateTime;

    private int renterId;
}
