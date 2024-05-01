package com.hms.designpatterns.decorator;

/**
 * @ClassName Trouser
 * @Author hms
 * @Date 2024/2/25 19:20
 * @Description TODO
 */
public class Trouser extends Finery{
    public Trouser(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("Trouser");
        super.show();
    }
}
