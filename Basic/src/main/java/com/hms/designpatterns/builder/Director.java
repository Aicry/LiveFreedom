package com.hms.designpatterns.builder;

/**
 * @ClassName Director
 * @Author hms
 * @Date 2024/3/3 18:46
 * @Description TODO
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder();
        director.construct(b1);
        Product p1 = b1.GetResult();
        p1.show();
    }
}
