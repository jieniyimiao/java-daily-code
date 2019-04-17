package com.sino.daily.code_2019_4_16;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created on 2019/4/17 15:05.
 *
 * @author caogu
 */
public class ScheduledExecutorServiceTest {
    public static void main(String[] args) {
        //立刻执行，而且每隔1000毫秒执行一次。
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("run "+ System.currentTimeMillis());
            }
        }, 0, 1000, TimeUnit.MILLISECONDS);
    }
}
