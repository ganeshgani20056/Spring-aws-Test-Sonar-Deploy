package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {

    @GetMapping("/cseadd")
    public Map<String, Object> addCSE(@RequestParam int a, @RequestParam int b) {

        Map<String, Object> response = new HashMap<>();

        response.put("result", a + b);
        response.put("designed_by", "23MH1A0525");

        return response;
    }
}