package com.product.product.service;

import com.product.product.dao.Product;
import com.product.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



public class ProductService {

    @Autowired
    private  ProductRepository productRepository;
    @Bean
    public void setup(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Apple", "Fruits", 1.0, true));
        productList.add(new Product("Dragonfruit", "Fruits", 1.0, true));
        productList.add(new Product("Passionfruit", "Fruits", 2.0, false));
        productList.add(new Product("Spinach", "Vegetables", 2.0, true));
        productList.add(new Product("Pumpkin", "Vegetables", 4.0, false));
        productList.add(new Product("Peas", "Vegetables", 1.0, true));
        productRepository.saveAll(productList);
    }
}
