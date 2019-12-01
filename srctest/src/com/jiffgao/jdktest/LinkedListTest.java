package com.jiffgao.jdktest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yangyinmei
 * @ClassName: LinkedListTest
 * @Description:
 * @date: 2019/12/1
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        LinkedList linkedList = new LinkedList();
        linkedList.add("c");
        linkedList.add("d");
        linkedList.addAll(1,list);
    }
}
