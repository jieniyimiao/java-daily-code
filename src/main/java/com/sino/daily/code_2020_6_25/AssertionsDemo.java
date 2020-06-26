package com.sino.daily.code_2020_6_25;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * create by 2020-06-26 10:34
 *
 * @author caogu
 */
public class AssertionsDemo {
    @Test
    @Tag("MOCK")
    void test1(TestReporter testReporter) {
        fail("Not yet implemented");
    }

    @Test
    @Tag("MOCK") //同一个测试方法指定多个不同的 Tag
    @Tag("ALL")
    void test2() {
        fail("Not yet implemented");
    }

    @Test
    @Tags({@Tag("ALL"), @Tag("MOCK")})
    void test3(TestInfo info) {
        // 默认提供了一个方法参数 TestInfo
        info.getTags();
        info.getDisplayName();
    }



}
