package com.hms.designpatterns.singleton;

/**
 * @Author Hms
 * @Date 2024/09/13 22:55
 **/
public class ESingleton {

    /**类在加载的时候直接进行初始化*/
    private static final ESingleton ESINGLETON = new ESingleton();

    private ESingleton() {}

    /**对外暴露唯一接口  提供单例对象*/
    public static ESingleton geteSingleton(){
        return ESINGLETON;
    }
}
