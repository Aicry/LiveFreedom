package com.hms.designpatterns.templateMethod;

/**
 * @ClassName TemplateClass
 * @Author hms
 * @Date 2024/3/3 16:39
 * @Description TODO
 */
public abstract class TemplateClass {

    public abstract void operation1();

    public abstract void operation2();

    public void TemplateMethod(){
        operation1();
        operation2();
    }
}
