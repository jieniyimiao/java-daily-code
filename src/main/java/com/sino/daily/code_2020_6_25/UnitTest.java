package com.sino.daily.code_2020_6_25;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.condition.OS.*;

/**
 * create by 2020-06-25 18:00
 *
 * @author caogu
 */

@DisplayName("my first test case")
class UnitTest {
    @BeforeAll  // 执行一次，执行时机是在所有测试和@BeforeEach 注解方法之前
    static void setup() {
    }

    @BeforeEach
        // 在每个测试执行之前执行
    void setupThis() {
    }

    @AfterEach
    void tearThis() {
    }

    @AfterAll
    static void tear() {
    }

    @Test
    @DisplayName("TEST ONE")
    void testCalcOne() {
        Assertions.assertEquals(6, Math.addExact(2, 4), "TEST ONE ok");
    }

    @Disabled("Disabled 因为重复")
    @Test
    @DisplayName("TEST TWO")
    void testCalcTwo() {
        assertTrue(2 == 2, "TEST TWO OK ");
    }

    @Test
    @EnabledOnOs(MAC)
    void testOnMac() {
        System.out.println("exec on mac");
    }

    @Test
    @EnabledOnOs({WINDOWS, LINUX})
    void testOnOs() {
        System.out.println("exec on windows or linux");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testOnJava8() {
        System.out.println("exec on java 8");
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "ENV", matches = ".*development.*")
    void notOnDeveloperWorkstation() {
        // ...
    }
}
