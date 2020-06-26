package com.sino.daily.code_2020_6_25;

import org.junit.Assert;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * create by 2020-06-26 11:46
 *
 * @author caogu
 */
public class TestNested {
    @DisplayName("自定义名称重复测试")
    @RepeatedTest(value = 3, name = "{displayName} 第 {currentRepetition} 次")
    public void test() {
    }

    @Test
    void testGroupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};
        Assertions.assertAll("numbers",
                () -> Assertions.assertEquals(numbers[1], 1),
                () -> Assertions.assertEquals(numbers[3], 3),
                () -> Assertions.assertEquals(numbers[4], 4)
        );
    }

    @Test
    @DisplayName("超时方法测试")
    void test_should_complete_in_one_second() {
        Assertions.assertTimeoutPreemptively(Duration.of(1, ChronoUnit.SECONDS), () -> Thread.sleep(2000));
    }

    @Test
    @DisplayName("测试捕获的异常")
    void assertThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(null);
        });
    }


}
