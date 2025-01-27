package com.hms.manage.interfaces.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/11/06 21:57
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserMenuDTO {

    private String name;

    private String path;

    private String component;

    private String icon;

    private Boolean hidden;

    private List<UserMenuDTO> children;

}
