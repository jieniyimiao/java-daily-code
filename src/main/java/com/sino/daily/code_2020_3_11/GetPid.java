package com.sino.daily.code_2020_3_11;

import java.lang.management.ManagementFactory;

/**
 * create by 2020-06-25 11:42
 *
 * @author caogu
 */
public class GetPid {
    public static void main(String[] args) {
        // get name representing the running Java virtual machine.
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(name);
        // get pid
        String pid = name.split("@")[0];
        System.out.println("Pid is:" + pid);
    }
}
