package com.hms.designpatterns.builder;

/**
 * @ClassName Builder
 * @Author hms
 * @Date 2024/3/3 18:41
 * @Description TODO
 */
public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public abstract Product GetResult();
}
