package com.hms.designpatterns.decorator;

/**
 * @ClassName Person
 * @Author hms
 * @Date 2024/2/25 19:07
 * @Description TODO
 */
public abstract class Person {

    private String name;

    public Person(String name){this.name = name;}

    public abstract void show();
}
