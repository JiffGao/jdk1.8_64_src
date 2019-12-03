package com.jiffgao.jdktest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @ClassName: HashMapTest
 * @Description:
 * @date: 2019/12/3
 */
public class HashMapTest {
    public static void main(String[] args) {
        // int n = 100 - 1;
        // n |= n >>> 1;
        // n |= n >>> 2;
        // n |= n >>> 4;
        // n |= n >>> 8;
        // n |= n >>> 16;
        // System.out.println(n);
        // System.out.println(1 << 30);
        Map map = new HashMap();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        map.put("5","e");
        map.put("6","f");
        map.put("7","g");
        map.put("8","h");
        map.put("9","i");
        new HashMap(map);
    }
}
