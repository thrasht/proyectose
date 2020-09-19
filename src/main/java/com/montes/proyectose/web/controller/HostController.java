package com.montes.proyectose.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HostController {

    @GetMapping
    public String gateway() {
        return "hola prro";
    }
}
