package com.hms.manage.domain.article.entity;

import com.hms.manage.domain.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author Hms
 * @Date 2024/11/20 20:52
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class Tag extends BaseEntity {

    /**
     *  标签名
     */
    private String tagName;
}