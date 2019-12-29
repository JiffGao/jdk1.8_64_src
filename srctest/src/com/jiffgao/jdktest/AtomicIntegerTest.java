package com.jiffgao.jdktest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yangyinmei
 * @ClassName: AtomicIntegerTest
 * @Description:
 * @date: 2019/12/28
 */
public class AtomicIntegerTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                System.out.println(atomicInteger.getAndIncrement());
            }).start();
        }
    }
}
