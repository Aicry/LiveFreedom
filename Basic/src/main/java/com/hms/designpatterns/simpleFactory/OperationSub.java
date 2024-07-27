package com.hms.designpatterns.simpleFactory;

/**
 * @ClassName OperationSub
 * @Author hms
 * @Date 2024/2/25 17:16
 * @Description TODO
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
