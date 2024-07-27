package com.hms.designpatterns.Observer;

/**
 * @ClassName ConcreteObserver
 * @Author hms
 * @Date 2024/3/5 21:21
 * @Description TODO
 */
public class ConcreteObserver extends Observer {

    private String name;

    private String observerState;


    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();

        System.out.println("观察者" + name + "的新状态是" + observerState);
    }
}
