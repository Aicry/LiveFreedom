package com.hms.designpatterns.proxy;

/**
 * @ClassName Pursuit
 * @Author hms
 * @Date 2024/2/28 23:41
 * @Description TODO
 */
public class Pursuit implements GiveGift{

    private Girl girl;

    public Pursuit(Girl girl){
        this.girl = girl;
    }

    @Override
    public void GiveDolls() {
        System.out.println("GiveDolls");
    }

    @Override
    public void GiveFlowers() {
        System.out.println("GiveFlowers");
    }

    @Override
    public void GiveChocolate() {
        System.out.println("GiveChocolate");
    }
}
