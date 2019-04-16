package com.sino.daily.code_2019_4_16;

import java.util.concurrent.TimeUnit;

/**
 * Created on 2019/4/16 21:22.
 *
 * @author caogu
 */
public class ThreadForRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("thread for runnable!");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("--step1--");
        Thread t = new Thread(new ThreadForRunnable());
        t.start();
        System.out.println("--step2--");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("--step3--");
    }
}
