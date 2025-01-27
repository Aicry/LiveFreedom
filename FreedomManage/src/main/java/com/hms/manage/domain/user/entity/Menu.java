package com.hms.manage.domain.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author Hms
 * @Date 2024/11/06 22:01
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    private Integer id;

    private String name;

    private String path;

    private String component;

    private String icon;

    private Integer orderNum;

    private Integer parentId;

    private Integer isHidden;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}