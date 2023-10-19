package com.hms.livefreedom.infrastructure.filter;

import com.alibaba.fastjson2.JSONObject;
import com.hms.livefreedom.domain.common.ApiResponse;
import com.hms.livefreedom.infrastructure.enums.ResponseCode;
import com.hms.livefreedom.infrastructure.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        //1.获取资源请求的路径,强制转换
        HttpServletRequest request = (HttpServletRequest) req;
        String rString = request.getRequestURI();
        String token = request.getHeader("Authorization");
        HttpServletResponse response = (HttpServletResponse) res;
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8081");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        //2.有些资源需要放行
        if (rString.contains("/login") || rString.contains("/checkLogin") || rString.contains("/checkCode") ||
                rString.contains("/css/") || rString.contains("/js/") || rString.contains("/fonts/")) {
            chain.doFilter(request, response);
            return;
        }
        if (request.getMethod().equals("OPTIONS")) {
            chain.doFilter(req, response);
            return;
        }
        //3.当访问其他资源，就判断是否登录
        boolean validateJwtToken = jwtUtil.validateJwtToken(token);
        if (validateJwtToken) {
            chain.doFilter(req, response);
        } else {
            log.info("未登录");
            response.getWriter().write(JSONObject.toJSONString(ApiResponse.
                    failed(ResponseCode.UNAUTHORIZED.getCode(), "not login！！！")));
        }
    }
}
