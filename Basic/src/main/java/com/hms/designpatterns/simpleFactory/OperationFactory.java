package com.hms.designpatterns.simpleFactory;

/**
 * @ClassName OperationFactory
 * @Author hms
 * @Date 2024/2/25 17:14
 * @Description 简单工厂模式
 * 工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，去除与产品的依赖
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
        }
        return operation;
    }

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumberA(1);
        operation.setNumberB(2);
        System.out.println(operation.getResult());
    }
}
