package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.ProductService;

@RestController
public class ProductController 
{
	
	@Autowired
    private ProductService productService;

    @GetMapping("/fetch-products")
    public String fetchProducts() {
        productService.fetchAndSaveProducts();
        return "Products fetched and saved successfully!";
    }
}


