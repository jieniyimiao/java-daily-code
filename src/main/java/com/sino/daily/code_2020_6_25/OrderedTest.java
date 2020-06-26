package com.sino.daily.code_2020_6_25;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * create by 2020-06-26 17:35
 *
 * @author caogu
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {
    @Test
    @Order(2)
    void emptyValues() {
        // perform assertions against empty values
    }
    @Test
    @Order(1)
    void nullValues() {
        // perform assertions against null values
    }
    @Test
    @Order(3)
    void validValues() {
        // perform assertions against valid values
    }
}