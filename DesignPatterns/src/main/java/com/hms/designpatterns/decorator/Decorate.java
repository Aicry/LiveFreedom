package com.hms.designpatterns.decorator;

/**
 * @ClassName Decorate
 * @Author hms
 * @Date 2024/2/25 19:21
 * @Description 装饰者模式
 */
public class Decorate {
    public static void main(String[] args) {
        String name = "hms";
        Person hms = new Person(name) {
            @Override
            public void show() {
                System.out.println(name);
            }
        };

        TShirts tShirts = new TShirts("a");
        Trouser trouser = new Trouser("b");

        tShirts.Decorate(hms);
        trouser.Decorate(tShirts);
        trouser.show();
    }
}
