package com.hms.designpatterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subject
 * @Author hms
 * @Date 2024/3/5 21:11
 * @Description TODO
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void update() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
