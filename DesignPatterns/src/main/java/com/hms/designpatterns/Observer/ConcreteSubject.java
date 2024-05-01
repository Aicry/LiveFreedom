package com.hms.designpatterns.Observer;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName ConcreteSubject
 * @Author hms
 * @Date 2024/3/5 21:19
 * @Description TODO
 */
public class ConcreteSubject extends Subject{

    @Getter
    @Setter
    private String subjectState;
}
