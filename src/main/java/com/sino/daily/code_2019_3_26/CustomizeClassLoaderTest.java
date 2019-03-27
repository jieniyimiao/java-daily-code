package com.sino.daily.code_2019_3_26;

import java.lang.reflect.Method;

/**
 * Created on 2019/3/27 22:56.
 *
 * @author caogu
 */
public class CustomizeClassLoaderTest {
    public static void main(String[] args) {
        try {
            String rootUrl = "file:///D:";
            String className = "com.sino.daily.code_2019_3_26.NetClassLoaderSimple";
            NetworkClassLoader networkClassLoader = new NetworkClassLoader(rootUrl);
            Class clazz = networkClassLoader.loadClass(className);
            Method[] methods = clazz.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.getName());
            }
            System.out.println(clazz.getClassLoader());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
