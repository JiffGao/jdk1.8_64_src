package com.jiffgao.jdktest;

import java.util.ArrayList;

/**
 * @author Administrator
 * @ClassName: ArrayListTest
 * @Description:
 * @date: 2019/11/29
 */
public class ArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(34);
        arrayList.add(56);
        arrayList.add(78);
        arrayList.add(90);
        // System.out.println(arrayList);
        // Integer[] str = new Integer[9];
        // Integer[] strings = arrayList.toArray(str);
        // for (Integer string : strings) {
        //     System.out.print(string + "\t");
        // }
        System.out.println(arrayList.set(3, 110));
        System.out.println(arrayList);
        // System.out.println(arrayList.isEmpty());
    }
}
