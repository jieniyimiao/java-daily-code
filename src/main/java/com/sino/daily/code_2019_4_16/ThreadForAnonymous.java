package com.sino.daily.code_2019_4_16;

/**
 * Created on 2019/4/17 14:07.
 *
 * @author caogu
 */
public class ThreadForAnonymous {
    public static void main(String[] args) {
        // 基于接口的实现
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    printThreadInfo();
                }
            }
        }).start();

        // 基于子类的方式
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    printThreadInfo();
                }
            }
        }.start();

        new Thread(() -> {
            while (true) {
                printThreadInfo();
            }
        }).start();

    }

    /**
     * 输出当前线程的信息
     */
    private static void printThreadInfo() {
        System.out.println("当前运行的线程名为： " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
