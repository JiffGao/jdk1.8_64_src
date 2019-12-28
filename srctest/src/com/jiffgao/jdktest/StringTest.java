package com.jiffgao.jdktest;

/**
 * @author Administrator
 * @ClassName: StringTest
 * @Description:
 * @date: 2019/12/26
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = new StringBuilder("¼ÆËã»ú").append("Èí¼þ").toString();
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str1.intern() == str1);
        System.out.println(str2.intern() == str2);
        System.out.println(str2.intern().hashCode());
        System.out.println(str2.hashCode());
    }
}
