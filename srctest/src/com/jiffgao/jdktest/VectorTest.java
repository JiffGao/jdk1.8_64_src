package com.jiffgao.jdktest;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * @author Administrator
 * @ClassName: VectorTest
 * @Description:
 * @date: 2019/12/3
 */
public class VectorTest {
    public static void main(String[] args) {
        List list = new Vector();
        list.add("jfhdkls");
        list.add("hdjks");
        String[] strings = new String[list.size()];
        ((Vector) list).copyInto(strings);
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println(list.size());
        System.out.println(((Vector) list).capacity());
        Enumeration enumeration =  ((Vector) list).elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
