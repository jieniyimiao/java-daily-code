package com.sino.daily.code_2019_3_26;

/**
 * Created on 2019/3/26 20:27.
 *
 * @author caogu
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        getClassLoaderSort();
    }

    private static void getClassLoaderSort()
    {
        ClassLoader c  = ClassLoaderTest.class.getClassLoader();  //获取ClassLoaderTest类的类加载器
        System.out.println(c);
        ClassLoader c1 = c.getParent();  //获取c这个类加载器的父类加载器
        System.out.println(c1);
        ClassLoader c2 = c1.getParent();//获取c1这个类加载器的父类加载器
        System.out.println(c2);
    }
}
