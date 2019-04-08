package com.sino.daily.code_2019_3_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 2019/3/30 9:48.
 *
 * @author caogu
 */
public class DoubleBraceInitialization {
    // 新建map并初始化
    private static Map<String, String> map1 = new HashMap<String, String>(){
        // 匿名内部类 + 非静块初始化
        {
            this.put("1", "1");
            this.put("2", "2");
        }
    };

    private static List<String> list1 = new ArrayList<String>() {
        {
            this.add("1");
            this.add("2");
        }
    };

    public static void main(String[] args) {

    }
}
