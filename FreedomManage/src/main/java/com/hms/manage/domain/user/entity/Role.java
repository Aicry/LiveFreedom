package com.hms.manage.domain.user.entity;

import com.hms.manage.domain.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author Hms
 * @Date 2024/11/07 21:02
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role extends BaseEntity {

    private String roleName;

    private String isDisable;

}
