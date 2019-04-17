package com.sino.daily.code_2019_4_16;

import org.joda.time.DateTime;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created on 2019/4/17 14:32.
 *
 * @author caogu
 */
public class ThreadForTimer {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        //指定时间点执行
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("指定时间点执行");
            }
        }, DateTime.now().plusSeconds(5).toDate());

        //间隔时间重复执行
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("间隔时间重复执行");
            }
        }, new Date(), 2000);

        Thread.sleep(10000);
        // 不取消线程会一值存在
        timer.cancel();
    }
}
