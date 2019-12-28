package com.jiffgao.jdktest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Administrator
 * @ClassName: InputStreamTest
 * @Description:
 * @date: 2019/12/18
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("F:\\out.xml");
        byte[] bytes = new byte[inputStream.available()];
        System.out.println(inputStream.available());
        for (; inputStream.available() > 0; ) {
            inputStream.read(bytes,0,bytes.length);
            System.out.println(new String(bytes));
        }
        System.out.println(inputStream.available());

        System.out.println("00");
        System.out.println("\u0000");
        System.out.println("00");
    }
}
