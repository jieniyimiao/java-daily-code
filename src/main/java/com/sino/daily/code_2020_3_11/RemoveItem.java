package com.sino.daily.code_2020_3_11;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * create by 2020-08-23 12:23
 *
 * @author caogu
 */
public class RemoveItem {
    public static void remove1(List<String> list, String target) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String item = iter.next();
            if (item.equals(target)) {
                iter.remove();
            }
        }
    }

    public static void remove2(List<String> list, String target) {
        list.removeIf(Predicate.isEqual(target));
    }

    public static long count1(List<Integer> list) {
        long count = 0;
        for (Integer item : list) {
            if (item > 20) {
                count++;
            }
        }
        return count;
    }

    public static long count2(List<Integer> list) {
        return list.stream()
                .filter(item -> item > 20)
                .count();
    }



}
