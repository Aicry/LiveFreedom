package demo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class jwt {


    @Test
    public void testGwt() {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", "1");
        hashMap.put("name","hms");
        String hms = Jwts.builder().signWith(SignatureAlgorithm.HS256, "hms_hms")
                .setClaims(hashMap).setExpiration(new Date(System.currentTimeMillis() + 1000 * 600)).compact();
        System.out.println(hms);
        Claims body = Jwts.parser().setSigningKey("hms_hms").parseClaimsJws(hms).getBody();
        System.out.println(body);
    }


}
