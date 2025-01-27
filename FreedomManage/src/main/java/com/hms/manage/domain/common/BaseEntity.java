package com.hms.manage.domain.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.hms.manage.infrastructure.enums.Flag;
import lombok.Data;

import java.util.Date;

/**
 * @Author Hms
 * @Date 2024/05/18 21:35
 **/
@Data
public class BaseEntity {

    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    private String enableFlag;

    private String deleteFlag;

    private Long createBy;

    private Long updateBy;

    private Date createTime;

    private Date updateTime;

    private Long renterId;

    public void init(){
        this.enableFlag = Flag.Y.getMessage();
        this.deleteFlag = Flag.N.getMessage();
        this.createBy = -1L;
        this.updateBy = -1L;
        this.createTime = new Date();
        this.updateTime = new Date();
        this.renterId = 1L;
    }
}
