package com.hms.manage.domain.user.query;

import lombok.Data;

import java.util.List;

/**
 * @Author Hms
 * @Date 2024/05/18 16:53
 **/
@Data
public class UserQuery extends BaseQuery{

    private List<String> userNameList;

    private Long userId;

    private String userName;
}
