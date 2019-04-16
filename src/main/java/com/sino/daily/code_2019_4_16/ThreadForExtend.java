package com.sino.daily.code_2019_4_16;

import java.util.concurrent.TimeUnit;

/**
 * 实现多线程方式一：继承Thread类
 * Created on 2019/4/16 20:57.
 * @author caogu
 */
public class ThreadForExtend extends Thread {
    @Override
    public void run() {
        System.out.println("this thead for extends thead!");
    }

    // 设置线程名字
    public ThreadForExtend() {
        this.setName("thread-threadForExtend");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("--step1--");
        ThreadForExtend t = new ThreadForExtend();
        t.start();
        System.out.println("--step2--");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("--step3--");
    }
}
