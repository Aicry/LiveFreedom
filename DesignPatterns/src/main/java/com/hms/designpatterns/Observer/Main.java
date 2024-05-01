package com.hms.designpatterns.Observer;

/**
 * @ClassName Main
 * @Author hms
 * @Date 2024/3/5 21:23
 * @Description TODO
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver(s,"X"));
        s.attach(new ConcreteObserver(s,"Y"));
        s.attach(new ConcreteObserver(s,"Z"));
        s.setSubjectState("ABC");
        s.update();
    }
}
