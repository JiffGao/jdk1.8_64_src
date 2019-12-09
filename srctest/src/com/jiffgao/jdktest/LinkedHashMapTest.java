package com.jiffgao.jdktest;

import com.jiffgao.myutil.MyLinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author Administrator
 * @ClassName: LinkedHashMap
 * @Description:
 * @date: 2019/12/6
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        MyLinkedHashMap linkedHashMap = new MyLinkedHashMap();
        linkedHashMap.put("3","dsa");
        linkedHashMap.put("332","dsa");
        linkedHashMap.put("1","dsa");
        linkedHashMap.put("7","dsa");
        System.out.println(linkedHashMap);
        // HashMap hashMap = new HashMap();
        // hashMap.put("3","dsa");
        // hashMap.put("332","dsa");
        // hashMap.put("1","dsa");
        // hashMap.put("7","dsa");
        // System.out.println(hashMap);

    }
}
