package com.jiffgao.jdktest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Administrator
 * @ClassName: ArrayListTest
 * @Description:
 * @date: 2019/11/29
 */
public class ArrayListTest {
    static MyArrayList<Integer> arrayList = new MyArrayList<Integer>();

    public static void main(String[] args) {
        // test();
        // for (int i = 0; i < 5; i++) {
        //     removeTest();
        // }
        // if (Thread.activeCount() > 2) {
        //     Thread.yield();
        // }
        // System.out.println(arrayList);
        arrayList.add(12);
        arrayList.add(867);
        arrayList.add(543);
        arrayList.add(324);
        arrayList.add(5);
        arrayList.add(6);
        // ListIterator listIterator = arrayList.listIterator(3);
        // System.out.println(listIterator);
        // while (listIterator.hasNext()){
        //     System.out.println(listIterator.next());
        // }
        List subList = arrayList.subList(2,5);
        arrayList.set(3,110);
        subList.forEach(x -> System.out.println(x));
        System.out.println(subList);
    }

    private static void removeTest() {
        arrayList.add(12);
        arrayList.add(867);
        arrayList.add(543);
        arrayList.add(324);
        MyArrayList<Integer> arrayList1 = new MyArrayList<Integer>();
        arrayList1.add(12);
        arrayList1.add(867);
        new Thread(() -> {
            System.out.println("****************");
            arrayList.removeAll(arrayList1);
        }).start();
        new Thread(() -> {
            arrayList.remove((Object)90);
            arrayList.remove((Object)78);
        }).start();
        // arrayList.removeRange(0,2);
    }

    private static void test() {
        MyArrayList<Integer> arrayList = new MyArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(34);
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
