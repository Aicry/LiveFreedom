package com.hms.designpatterns.decorator;

/**
 * @ClassName Finery
 * @Author hms
 * @Date 2024/2/25 19:15
 * @Description TODO
 */
public class Finery extends Person {

    private Person component;

    public Finery(String name) {
        super(name);
    }

    public void Decorate(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
