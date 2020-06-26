package com.sino.daily.code_2020_6_25;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * create by 2020-06-26 11:56
 *
 * @author caogu
 */
@DisplayName("内嵌测试类")
public class NestUnitTest {
    @BeforeEach
    void init() {
    }

    @Nested
    @DisplayName("第一个内嵌测试类")
    class FirstNestTest {
        @Test
        void test() { }
    }

    @Nested
    @DisplayName("第二个内嵌测试类")
    class SecondNestTest {
        @Test
        void test() { }
    }
}