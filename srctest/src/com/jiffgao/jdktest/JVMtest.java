package com.jiffgao.jdktest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangyinmei
 * @ClassName: JVMtest
 * @Description:
 * @date: 2019/12/24
 */
public class JVMtest {
    public static void main(String[] args) throws InterruptedException {
        Map map = new HashMap();
        Thread.sleep(10000);
        int i = 0;
        while (true) {
            byte[] b = new byte[512];
            map.put(i++, b);
            Thread.sleep(1000);
            System.out.println(i);
            if (map.size() > 100) {
                map.clear();
            }
        }
    }
}
