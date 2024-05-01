package com.hms.designpatterns.builder;

/**
 * @ClassName ConcreteBuilder
 * @Author hms
 * @Date 2024/3/3 18:42
 * @Description TODO
 */
public class ConcreteBuilder extends Builder{

    private Product product = new Product();

    @Override
    public Product GetResult() {
        return product;
    }

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public void buildPartC() {
        product.add("部件C");
    }
}
