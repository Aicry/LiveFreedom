package com.hms.designpatterns.strategy;

/**
 * @ClassName ConcreteStrategyA
 * @Author hms
 * @Date 2024/2/25 17:28
 * @Description TODO
 */
public class CashRebate extends CashSuper {

    private double rebate = 1.0;

    public CashRebate(double rebate){
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*rebate;
    }
}
