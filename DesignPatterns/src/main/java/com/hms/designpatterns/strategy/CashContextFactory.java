package com.hms.designpatterns.strategy;

import java.util.Scanner;

/**
 * @ClassName CashContextFactory
 * @Author hms
 * @Date 2024/2/25 17:45
 * @Description 简单工厂与策略模式
 */
public class CashContextFactory {
    public CashSuper cashSuper= null;
    public CashContextFactory(String type) {
        if ("打八折".equals(type)) {
            cashSuper = new CashRebate(0.8);
        }
    }
    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }

    public static void main(String[] args) {
        //策略模式与简单工厂模式结合，减轻客户端职责
        Scanner sc = new Scanner( System.in );
        String nextLine = sc.nextLine();
        CashContextFactory cashContextFactory = new CashContextFactory(nextLine);
        System.out.println(cashContextFactory.getResult(100));
    }
}
