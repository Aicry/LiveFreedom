package com.hms.jvm;

/**
 * @Author Hms
 * @Date 2024/06/22 18:09
 **/
public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);//扩展类

        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);

        ClassLoader classLoader3 = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader3);

        ClassLoader classLoader4 = String.class.getClassLoader();
        System.out.println(classLoader4);

    }
}
