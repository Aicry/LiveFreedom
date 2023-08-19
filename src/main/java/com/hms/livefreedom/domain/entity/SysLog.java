package com.hms.livefreedom.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统日志
 * @TableName sys_log
 */
@TableName(value ="sys_log")
@Data
public class SysLog implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
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

    /**
     * 
     */
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}