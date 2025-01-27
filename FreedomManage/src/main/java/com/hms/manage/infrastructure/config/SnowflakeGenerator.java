package com.hms.manage.infrastructure.config;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.lang.generator.Generator;
import org.springframework.stereotype.Component;

/**
 * @Author Hms
 * @Date 2024/05/18 22:33
 **/
@Component
public class SnowflakeGenerator implements Generator<Long> {

    private static final Snowflake snowflake = new Snowflake(0, 0);

    public Long next() {
        return snowflake.nextId();
    }
}