package com.hms.livefreedom.infrastructure.aspect;

import com.hms.livefreedom.domain.entity.SysLog;
import com.hms.livefreedom.infrastructure.annotation.Log;
import com.hms.livefreedom.service.SysLogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@Aspect
@Component
public class LogAspect {

    @Autowired
    private SysLogService service;

    @Pointcut("@annotation(com.hms.livefreedom.infrastructure.annotation.Log)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        Log annotation = method.getAnnotation(Log.class);
        InetAddress local = InetAddress.getLocalHost();
        if(annotation != null) {
            SysLog sysLog = new SysLog();
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sysLog.setLogType(annotation.value());
            sysLog.setMethod(method.getName());
            sysLog.setParams(Arrays.toString(point.getArgs()));
            sysLog.setAddress(local.getHostName());
            sysLog.setRequestIp(local.getHostAddress());
            sysLog.setCreateTime(new Date());
            service.save(sysLog);
        }
        return point.proceed();
    }
}
