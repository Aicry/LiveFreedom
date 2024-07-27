package com.hms.designpatterns.templateMethod;

/**
 * @ClassName ConcreteClass
 * @Author hms
 * @Date 2024/3/3 16:41
 * @Description TODO
 */
public class ConcreteClass extends TemplateClass{
    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {

    }

    public static void main(String[] args) {
        TemplateClass concreteClass = new ConcreteClass();
        concreteClass.TemplateMethod();
    }
}
