package com.store.Masa.aStore.controllers;

import com.store.Masa.aStore.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
@AllArgsConstructor
public class ProductController {
    ProductRepository productRepository;

    @GetMapping
    public String getAllProducts() {
        return "aa";
    }
}
