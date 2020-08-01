package com.sino.daily.code_2020_3_11;

/**
 * create by 2020-08-01 21:21
 *
 * @author caogu
 */
public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("I want to rent my house");
    }

    @Override
    public void hello(String str) {
        System.out.println("hello: " + str);
    }
}
