package com.hms.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Product
 * @Author hms
 * @Date 2024/3/3 18:39
 * @Description TODO
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\n产品创建----");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
