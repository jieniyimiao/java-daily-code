package com.sino.daily.code_2019_4_16;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;


/**
 * Created on 2019/4/16 21:36.
 *
 * @author caogu
 */
public class ThreadForCallable {

    public static void main(String[] args) throws Exception {
        int poolSize = 5;
        //创建一个线程池
        ExecutorService threadPoll = Executors.newFixedThreadPool(poolSize);
        List<Future<Object>> futures = new ArrayList<>();
        //创建多个Task
        for (int i = 0; i < poolSize; i ++) {
            MyTask task = new MyTask("No" + i);
            //放入线程池中执行任务并取得返回值
            Future<Object> future = threadPoll.submit(task);
            futures.add(future);
        }

        //关闭线程池
        threadPoll.shutdown();
        System.out.println("--start--");

        //输出所有结果(会阻塞等待当前线程的返回结果)
        for(Future<Object> f : futures) {
            System.out.println(f.get(10, TimeUnit.SECONDS).toString());
        }
    }

   private static class MyTask implements Callable<Object> {
        private String taskNo;

        public MyTask(String taskNo) {
            this.taskNo = taskNo;
        }

        @Override
        public Object call() throws InterruptedException {
            System.out.println("任务 " + taskNo + " 启动了...");
            Date startTime = new Date();
            TimeUnit.SECONDS.sleep(5);
            Date endTime = new Date();
            long costTime = endTime.getTime() - startTime.getTime();
            System.out.println("任务 " + taskNo + " 执行完毕.");

            //返回值
            return taskNo + " 任务返回运行结果, 任务执行耗费时间【" + costTime + "毫秒】";
        }
    }

}
