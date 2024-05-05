package com.example.JPDEMO.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController

public class HelloController {

    @GetMapping("/app/foo")

    public Map<String , String> foo() {

        Map<String, String> json = new HashMap<>();
        json.put("message", "Hola, estoy en mi iMAC con SPRING BOOT");
        json.put("date", new Date().toString());
        return json;
    }
}
