package com.sino.daily.code_2019_3_30;

import com.google.common.base.MoreObjects;

/**
 * Created on 2019/3/30 10:26.
 *
 * @author caogu
 */
public class Book {
    private static String defaultName;
    private String name;

    static {
        defaultName = "default book";
        System.out.println("default book");
    }

    {
        name = "book name";
        System.out.println("book name");
    }

    public Book() {
        System.out.println("Book Nll Constructor");
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .toString();
    }

}
