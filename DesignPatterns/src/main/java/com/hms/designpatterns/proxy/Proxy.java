package com.hms.designpatterns.proxy;

/**
 * @ClassName Proxy
 * @Author hms
 * @Date 2024/2/28 23:44
 * @Description TODO
 */
public class Proxy implements GiveGift{

    private Pursuit pursuit;

    public Proxy(Girl girl) {
        pursuit = new Pursuit(girl);
    }


    @Override
    public void GiveDolls() {
        pursuit.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        pursuit.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        pursuit.GiveChocolate();
    }

    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setName("hhh");
        Proxy proxy = new Proxy(girl);
        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();

    }
}
