package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CseControllerTest {

    @Autowired
    CseController c;

    @Test
    void test() {

        String response = c.addCSE(2, 3);

        System.out.println("Test Output: " + response);

        // Result check
        assertTrue(response.contains("Result = 5"));

        // Designed by check
        assertTrue(response.contains("Developed by 23MH1A0525"));
    }
}