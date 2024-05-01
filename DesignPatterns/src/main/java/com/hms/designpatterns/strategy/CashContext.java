package com.hms.designpatterns.strategy;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @ClassName Context
 * @Author hms
 * @Date 2024/2/25 17:29
 * @Description 策略模式
 */
public class CashContext {
    public CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double GetResult(double money) {
        return cashSuper.acceptCash(money);
    }

    public static void main(String[] args) {
        // 基本策略模式，选择策略的职责由客户端承担
        Scanner sc = new Scanner( System.in );
        String nextLine = sc.nextLine();
        if(nextLine.equals("打八折")){
            CashContext context = new CashContext(new CashRebate(0.8));
            System.out.println(context.GetResult(1));
        }
    }
}
