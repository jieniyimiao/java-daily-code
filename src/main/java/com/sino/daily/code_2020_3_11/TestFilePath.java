package com.sino.daily.code_2020_3_11;

import java.io.File;

/**
 * create by 2020-05-31 08:46
 *
 * @author caogu
 */
public class TestFilePath {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));

        System.out.println("-----默认相对路径：取得路径不同------");
        File file1 = new File("..\\src\\test1.txt");
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getCanonicalPath());

        System.out.println("-----默认相对路径：取得路径不同------");
        File file = new File(".\\test1.txt");
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());

        System.out.println("-----默认绝对路径:取得路径相同------");
        File file2 = new File("D:\\workspace\\test\\test1.txt");
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getCanonicalPath());
    }
}
