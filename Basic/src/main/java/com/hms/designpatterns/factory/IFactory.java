package com.hms.designpatterns.factory;

import com.hms.designpatterns.simpleFactory.Operation;

/**
 * @ClassName IFactory
 * @Author hms
 * @Date 2024/2/29 23:00
 * @Description TODO
 */
public interface IFactory {
    Operation createOperation();
}
