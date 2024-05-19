package com.hms.manage;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan(basePackages = "com.hms.manage.infrastructure.dao")
public class FreedomManage {
    public static void main(String[] args) {
        SpringApplication.run(FreedomManage.class, args);
    }
}
