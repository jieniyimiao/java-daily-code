package com.sino.daily.code_2020_3_11;

import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * create by 2020-08-01 22:36
 *
 * @author caogu
 */
public class FileAlteration {
    public static void main(String[] args) throws Exception {
        File directory = new File("D:/test");
        // 轮询间隔 5 秒
        long interval = TimeUnit.SECONDS.toMillis(5);
        // 创建一个文件观察器用于处理文件的格式
        FileAlterationObserver observer = new FileAlterationObserver(directory, FileFilterUtils.and(
                FileFilterUtils.fileFileFilter(), FileFilterUtils.suffixFileFilter(".txt")));
        // 设置文件变化监听器
        observer.addListener(new MyFileListener());
        FileAlterationMonitor monitor = new FileAlterationMonitor(interval, observer);
        monitor.start();
        //Thread.sleep(30000);
        //monitor.stop();
    }
}

final class MyFileListener implements FileAlterationListener {
    @Override
    public void onStart(FileAlterationObserver fileAlterationObserver) {
        System.out.println("monitor start scan files..");
    }


    @Override
    public void onDirectoryCreate(File file) {
        System.out.println(file.getName() + " director created.");
    }


    @Override
    public void onDirectoryChange(File file) {
        System.out.println(file.getName() + " director changed.");
    }


    @Override
    public void onDirectoryDelete(File file) {
        System.out.println(file.getName() + " director deleted.");
    }


    @Override
    public void onFileCreate(File file) {
        System.out.println(file.getName() + " created.");
    }


    @Override
    public void onFileChange(File file) {
        System.out.println(file.getName() + " changed.");
    }


    @Override
    public void onFileDelete(File file) {
        System.out.println(file.getName() + " deleted.");
    }


    @Override
    public void onStop(FileAlterationObserver fileAlterationObserver) {
        System.out.println("monitor stop scanning..");
    }
}
