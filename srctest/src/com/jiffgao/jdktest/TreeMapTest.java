package com.jiffgao.jdktest;

import com.jiffgao.myutil.MyTreeMap;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author Administrator
 * @ClassName: TreeMapTest
 * @Description:
 * @date: 2019/12/6
 */
public class TreeMapTest {
    public static void main(String[] args) {
        MyTreeMap myTreeMap = new MyTreeMap();
        myTreeMap.put(1, 2);
        myTreeMap.put(9, "ali");
        myTreeMap.put(3, "baidu");
        myTreeMap.put(21, "idea");
        myTreeMap.put(5, "world");
        // myTreeMap.forEach(h -> System.out.println(h));
        myTreeMap.forEach((key, value) -> {
            System.out.println(key + "£º" + value);
        });
        System.out.println(myTreeMap);
    }
}
