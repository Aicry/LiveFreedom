package com.hms.juc;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author Hms
 * @Date 2024/08/27 23:25
 **/
@Slf4j
public  class  PrintOddEven {
    private static final Object lock = new Object();
    private static int count = 1;
    private static final int MAX_COUNT = 10;

    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            synchronized (lock) {
                while (count < MAX_COUNT) {
                    if(count % 2 == 0) {
                        System.out.println(count);
                        count++;
                        lock.notify();
                    }else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        };

        Runnable runnable2 = () -> {
            synchronized (lock) {
                while (count < MAX_COUNT) {
                    if(count % 2 == 1) {
                        System.out.println(count);
                        count++;
                        lock.notify();
                    }else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}