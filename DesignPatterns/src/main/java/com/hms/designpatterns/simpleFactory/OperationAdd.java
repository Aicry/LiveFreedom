package com.hms.designpatterns.simpleFactory;

/**
 * @ClassName OperationAdd
 * @Author hms
 * @Date 2024/2/25 17:12
 * @Description TODO
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
