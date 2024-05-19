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

    private final Snowflake snowflake;

    public SnowflakeGenerator() {
        this(0L, 0L);
    }

    public SnowflakeGenerator(long workerId, long dataCenterId) {
        this.snowflake = new Snowflake(workerId, dataCenterId);
    }

    public Long next() {
        return this.snowflake.nextId();
    }
}