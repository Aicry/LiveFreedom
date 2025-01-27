package com.hms.designpatterns.singleton;

/**
 * @Author Hms
 * @Date 2024/09/13 22:54
 **/
public class Singleton {

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton (){}

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
