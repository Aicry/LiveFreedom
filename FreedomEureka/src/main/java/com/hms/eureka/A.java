package com.hms.eureka;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @Author Hms
 * @Date 2024/09/01 11:46
 **/
@Service
public class A {
    @Resource
    private B b;

    public void print(){
        System.out.println("A");
    }
}
