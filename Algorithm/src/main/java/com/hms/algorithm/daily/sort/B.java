package com.hms.algorithm.daily.sort;

/**
 * @Author Hms
 * @Date 2024/09/25 19:52
 * 试题1：按序打印
 * public class Foo {
 *     public void first() { print("first"); }
 *     public void second() { print("second"); }
 *     public void third() { print("third"); }
 * }
 *
 * 给定一个类，启动三个线程A、B、C，共用一个Foo实例，
 * 一个将会调用 first() 方法
 * 一个将会调用 second() 方法
 * 还有一个将会调用 third() 方法
 * 请设计修改程序，以确保 second() 方法在 first() 方法之后被执行，third() 方法在 second() 方法之后被执行。

 **/

import java.util.concurrent.atomic.AtomicInteger;

import static cn.hutool.core.lang.Console.print;

/**
 * @Author Hms
 * @Date 2024/09/25 20:11
 **/

public class B {

    private static final AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        Thread a = new Thread(() -> {
            atomicInteger.incrementAndGet();
            System.out.println("a");
        });

        Thread b = new Thread(() -> {
            while (atomicInteger.get() != 1){

            }
            if(atomicInteger.get() == 1) {
                atomicInteger.incrementAndGet();
                System.out.println("b");
            }
        });

        Thread c = new Thread(() -> {
            while (atomicInteger.get() != 2){

            }
            if(atomicInteger.get() == 2) {
                atomicInteger.incrementAndGet();
                System.out.println("c");
            }
        });

        a.start();
        b.start();
        c.start();
    }
}
