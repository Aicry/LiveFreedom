package com.hms.manage.domain.user.entity;

import java.io.Serializable;

import com.hms.manage.domain.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class FreedomLog extends BaseEntity implements Serializable {


    private Long logId;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String logType;

    /**
     * 
     */
    private String method;

    /**
     * 
     */
    private String params;

    /**
     * 
     */
    private String requestIp;

    /**
     * 
     */
    private Long time;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private String browser;

    /**
     * 
     */
    private String exceptionDetail;
}