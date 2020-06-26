package com.sino.daily.code_2020_6_25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

/**
 * create by 2020-06-26 14:11
 *
 * @author caogu
 */
public class AssumptionsDemo {

    @Test
    void testOnlyOnDeveloperWorkstation() {
        assumeTrue("DEV".equals(System.getenv("ENV")),
                () -> "Aborting test: not on developer workstation");
        // 该方法中下面所有的代码变为在上面假设的条件成立后执行
        // 如果上述假设不成立，则会忽略执行该行下面的代码
        System.out.println("assume is true!");
    }

    @Test
    void testInAllEnvironments() {
        assumingThat("CI".equals(System.getenv("ENV")),
                () -> {
                    // 仅当前面假设成立时，才会执行这里面的语句,且只会影响到该lambda表达式中的代码
                    assertEquals(2, 2);
                });

        //此处的断言不受上述assumingThat限制，在所有情况下都会执行
        assertEquals("a string", "a string");
    }
}
