package com.sino.daily.code_2019_3_26;

/**
 * Created on 2019/3/27 20:41.
 *
 * @author caogu
 */
public class NetClassLoaderTest {

    public static void main(String[] args) {
        try {
            //测试加载网络中的class文件
//            String rootUrl = "file:///C:\\Users\\jieniyimiao\\Desktop\\java-daily-code\\out\\production\\classes";
            String rootUrl = "file:///D:";
            String className = "com.sino.daily.code_2019_3_26.NetClassLoaderSimple";
            NetworkClassLoader ncl1 = new NetworkClassLoader(rootUrl);
            NetworkClassLoader ncl2 = new NetworkClassLoader(rootUrl);
            Class<?> clazz1 = ncl1.loadClass(className);
            Class<?> clazz2 = ncl2.loadClass(className);
            Object obj1 = clazz1.newInstance();
            Object obj2 = clazz2.newInstance();
            clazz1.getMethod("setNetClassLoaderSimple", Object.class).invoke(obj1, obj2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
