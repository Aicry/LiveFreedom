package com.hms.manage.domain.article.entity;

import com.hms.manage.domain.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author Hms
 * @Date 2024/11/20 20:54
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class Category extends BaseEntity {
    private String categoryName;
}
