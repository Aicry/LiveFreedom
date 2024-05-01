package com.hms.designpatterns.factory;

import com.hms.designpatterns.simpleFactory.Operation;
import com.hms.designpatterns.simpleFactory.OperationAdd;

/**
 * @ClassName AddFactory
 * @Author hms
 * @Date 2024/2/29 23:06
 * @Description TODO
 */
public class AddFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

    public static void main(String[] args) {
        IFactory operationFactory = new AddFactory();
        Operation operation = operationFactory.createOperation();
        operation.setNumberA(10);
        operation.setNumberB(20);
        double res = operation.getResult();
        System.out.println(res);
    }
}