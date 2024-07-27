package com.hms.designpatterns.facade;

/**
 * @ClassName Facade
 * @Author hms
 * @Date 2024/3/3 17:15
 * @Description TODO
 */
public class Facade {

    public SubSystemOne one;

    public SubSystemTwo two;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
    }

    public void methodA(){
        one.methodOne();
        two.methodTwo();
    }

    public void methodB(){
        two.methodTwo();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();

        facade.methodB();
    }
}
