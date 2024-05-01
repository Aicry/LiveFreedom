package com.hms.designpatterns.simpleFactory;

import lombok.Data;

/**
 * @ClassName Operation
 * @Author hms
 * @Date 2024/2/25 17:07
 * @Description TODO
 */
@Data
public abstract class Operation {
    private double numberA = 0;

    private double numberB = 0;

    public abstract double getResult();
}
