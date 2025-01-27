package com.hms.manage.infrastructure.filter;

import com.alibaba.fastjson.JSONObject;
import com.hms.manage.domain.common.ApiResponse;
import com.hms.manage.infrastructure.config.JedisConnectionFactory;
import com.hms.manage.infrastructure.enums.ResponseCode;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.io.IOException;

/**
 * @ClassName LoginFilter
 * @Author hms
 * @Date 2023/9/3 17:33
 * @Description TODO
 */
@Component
@WebFilter("/*")
@Slf4j
public class LoginFilter implements Filter {

    @Value("${freedom.frontUrl}")
    private String frontUrl;

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        chain.doFilter(req,res);
//        //1.获取资源请求的路径,强制转换
//        HttpServletRequest request = (HttpServletRequest) req;
//        String rString = request.getRequestURI();
//        HttpServletResponse response = (HttpServletResponse) res;
//        response.setContentType("text/html;charset=UTF-8");
//        response.setHeader("Access-Control-Allow-Origin", frontUrl);
//        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
//        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        //2.有些资源需要放行
//        if (rString.contains("/login") || rString.contains("/checkLogin") || rString.contains("/checkCode") ||
//                rString.contains("/css/") || rString.contains("/js/") || rString.contains("/fonts/")) {
//            chain.doFilter(request, response);
//            return;
//        }
//        if (request.getMethod().equals("OPTIONS")) {
//            chain.doFilter(req, response);
//            return;
//        }
//        // 3.当访问其他资源，就判断是否登录
//        // boolean validateJwtToken = jwtUtil.validateJwtToken(token);
//
//        String token = request.getHeader("Authorization");
//        if (JedisConnectionFactory.getJedis(token) != null) {
//            chain.doFilter(req, response);
//        } else {
//            log.info("未登录");
//            response.getWriter().write(JSONObject.toJSONString(ApiResponse.
//                    failed(ResponseCode.UNAUTHORIZED.getCode(), "not login！！！")));
//        }
    }
}
