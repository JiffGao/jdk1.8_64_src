package com.jiffgao.jdktest;

import java.util.Hashtable;
import java.util.Set;

/**
 * @author Administrator
 * @ClassName: HashtableTest
 * @Description:
 * @date: 2019/12/5
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable map = new Hashtable();
        map.put(1,"123");
        Set set = map.keySet();
        Set set1 = map.entrySet();
        System.out.println(set);
        System.out.println(set1);
    }
}
