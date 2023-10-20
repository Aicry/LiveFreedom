package com.hms.livefreedom.infrastructure.config;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;


public class JedisConnectionFactory {
    private static final JedisPool jedisPool;

    static {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(10);
        poolConfig.setMaxIdle(10);
        poolConfig.setMinIdle(0);
        poolConfig.setMaxWaitMillis(1000*100);
        jedisPool = new JedisPool(poolConfig,"192.168.1.102",6379,1000);
    }
    public static Jedis getJedis() {
        return jedisPool.getResource();
    }
}
