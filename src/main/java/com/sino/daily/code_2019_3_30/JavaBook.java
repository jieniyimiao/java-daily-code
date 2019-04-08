package com.sino.daily.code_2019_3_30;

import com.google.common.base.MoreObjects;

/**
 * Created on 2019/3/30 10:32.
 *
 * @author caogu
 */
public class JavaBook extends Book {
    private static String defaultNum;
    private Integer num;

    static {
        defaultNum = "100";
        System.out.println("100");
    }

    {
        num = 2;
        System.out.println("2");
    }

    public JavaBook() {
        System.out.println("JavaBook Nll Constructor");
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("num", num)
                .toString();
    }
}
