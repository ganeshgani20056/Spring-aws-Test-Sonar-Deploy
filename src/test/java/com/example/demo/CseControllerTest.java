package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CseControllerTest {

    @Autowired
    CseController c;

    @Test
    void test() {
        Map<String, Object> response = c.addCSE(2, 3);

        System.out.println("Test Output: " + response);

        assertEquals(5, response.get("result"));
        assertEquals("23MH1A0525", response.get("designed_by"));
    }
}