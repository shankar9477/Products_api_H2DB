package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Product;
import com.demo.repository.ProductRepository;

@Service
public class ProductService 
{
	
	private final String apiUrl = "https://fakestoreapi.com/products"; // Replace with actual API URL

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RestTemplate restTemplate;

    public void fetchAndSaveProducts() {
        // Fetch products from third-party API
        Product[] products = restTemplate.getForObject(apiUrl, Product[].class);
        
        

        if (products != null) {
            // Save products into the local database
            productRepository.saveAll(List.of(products));
        }
    }


}
