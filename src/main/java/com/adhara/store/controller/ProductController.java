package com.adhara.store.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/")
    public String getAll() {
        return "I'm a product 💅🏻";
    }
}
