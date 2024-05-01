package com.hms.designpatterns.decorator;

/**
 * @ClassName TShirts
 * @Author hms
 * @Date 2024/2/25 19:18
 * @Description TODO
 */
public class TShirts extends Finery{
    public TShirts(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("TShirt");
        super.show();
    }
}
