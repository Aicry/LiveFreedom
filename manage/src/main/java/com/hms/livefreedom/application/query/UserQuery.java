package com.hms.livefreedom.application.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuery extends BaseQuery{

    public String userName;

    public String gender;
}
