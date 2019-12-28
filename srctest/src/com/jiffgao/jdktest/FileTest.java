package com.jiffgao.jdktest;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * @author Administrator
 * @ClassName: FileTest
 * @Description:
 * @date: 2019/12/17
 * F:\000gaojinfu\工作日志\git问题总结.txt
 */
public class FileTest {
    private static enum PathStatus { INVALID, CHECKED };
    private transient PathStatus status = null;
    private String path = null;
    final boolean isInvalid() {
        if (status == null) {
            System.out.println(this.path.indexOf('\u0000'));
            status = (this.path.indexOf('\u0000') < 0) ? PathStatus.CHECKED
                : PathStatus.INVALID;
        }
        return status == PathStatus.INVALID;
    }

    public static void main(String[] args) throws IOException {
        // File file = new File("F:\\000gaojinfu\\工作日志\\git问题总结.txt");
        FileTest file = new FileTest();
        file.path="F:\\\\000gaojinfu\\\\工作日志\\\\git问题总结.txt";
        System.out.println(file.isInvalid());
        System.out.println(PathStatus.CHECKED);
        System.out.println(PathStatus.INVALID);

        // File file1 = new File("F:\\outnostd.xml");
        // System.out.println(file.canExecute());
        // System.out.println(file.canRead());
        // System.out.println(file.canWrite());
        // System.out.println(file.compareTo(file1));
        // System.out.println(file.getName());
        // System.out.println(file.equals(file1));
        // System.out.println(file.getAbsoluteFile());
        // System.out.println(file.getAbsolutePath());
        // System.out.println(file.getCanonicalFile());
        // System.out.println(file.getCanonicalPath());
        // System.out.println(file.getParent());
        // System.out.println(file.getFreeSpace());
        // System.out.println(file.getParentFile());
        // System.out.println(file.getPath());
        // System.out.println(file.getTotalSpace());
        // System.out.println(file.getUsableSpace());
        // System.out.println(file.isAbsolute());
        // System.out.println(file.lastModified());
        // String[] str = file.list();
        // for (String s : str) {
        //     System.out.println(s);
        // }
        // file.renameTo(new File("F:\\out.xml"));
        // System.out.println(file.toPath());
        // System.out.println(file.toURI());
        // File[] files1 = file.listFiles(new FileFilter() {
        //     @Override
        //     public boolean accept(File pathname) {
        //         if (pathname.getName().startsWith("YBT_003"))
        //             return true;
        //         return false;
        //     }
        // });
        // for (File file1 : files1) {
        //     System.out.println(file1.getPath());
        // }
        // System.out.println("********************");
        // File[] files2 = file.listFiles(new FilenameFilter() {
        //     @Override
        //     public boolean accept(File dir, String name) {
        //         if (name.startsWith("YBT_001"))
        //             return true;
        //         return false;
        //     }
        // });
        // for (File file1 : files2) {
        //     System.out.println(file1.getPath());
        // }
        // System.out.println(file.toURI());
        // System.out.println(file.toURL());
    }
}
