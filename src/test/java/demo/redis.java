package demo;

import com.hms.livefreedom.infrastructure.utils.config.JedisConnectionFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;

public class redis {
    private Jedis jedis;

    @BeforeEach
    void setUp() {
        jedis = JedisConnectionFactory.getJedis();

    }

    @Test
    void testConnect() {
        System.out.println("");
    }

    @Test
    void testString() {
        System.out.println(jedis.ping());
        String result = jedis.set("java_version", "1.8");
        System.out.println(result);
        String javaVersion  = jedis.get("java_version");
        System.out.println(javaVersion);
    }

    @Test
    void testHash() {
        jedis.hset("hms_map","name","hms");
        jedis.hset("hms_map","age","23");
        Map<String,String> map = jedis.hgetAll("hms_map");
        System.out.println(map);
    }

    @AfterEach
    void tearDown() {
        if(jedis!=null) {
            jedis.close();
        }
    }
}
