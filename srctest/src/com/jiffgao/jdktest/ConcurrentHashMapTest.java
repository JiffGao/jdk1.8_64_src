package com.jiffgao.jdktest;

/**
 * @author Administrator
 * @ClassName: ConcurrentHashMapTest
 * @Description:
 * @date: 2019/12/27
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        System.out.println(1 << 30);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(tableSizeFor(10));
        System.out.println(8 << 2);
    }


    static int tableSizeFor(int c) {
        int n = c - 1;
        System.out.println(n);
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        return n;
    }
}
