package com.hms.manage.infrastructure.config;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.params.SetParams;

@Slf4j
public class JedisConnectionFactory {
    private static final JedisPool jedisPool;

    static {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(10);
        poolConfig.setMaxIdle(10);
        poolConfig.setMinIdle(0);
        jedisPool = new JedisPool(poolConfig, "120.25.76.134", 6379, 1000);
    }

    public static String getJedis(String key) {
        Jedis jedis = null;
        try {
            //1.从连接池获取jedis对象
            jedis = jedisPool.getResource();
            //2.执行操作
            return jedis.get(key);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            if (jedis != null) {
                //如果使用JedisPool,close操作不是关闭连接，代表归还连接池
                jedis.close();
            }
        }
        return null;
    }

    public static void set(String jwtToken, String value, SetParams px) {
        try (Jedis jedis = jedisPool.getResource()) {
            //1.从连接池获取jedis对象
            //2.执行操作
            jedis.set(jwtToken, value, px);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        //如果使用JedisPool,close操作不是关闭连接，代表归还连接池
    }
}
