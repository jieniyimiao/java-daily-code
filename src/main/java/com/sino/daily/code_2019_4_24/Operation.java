package com.sino.daily.code_2019_4_24;

/**
 * Created on 2019/4/24 15:28.
 *
 * @author caogu
 */
public enum Operation{
    ADD {
        @Override
        public int eval(int arg1, int arg2) { return arg1 + arg2; };
    },

    SUBTRACT {
        @Override
        public int eval(int arg1, int arg2) { return arg1 - arg2; };
    };

    //定义抽象方法
    public abstract int eval(int arg1, int arg2);

    public static void main(String[] args) {
        System.out.println(Operation.ADD.eval(1,2));
        System.out.println(Operation.SUBTRACT.eval(1,2));
    }
}
