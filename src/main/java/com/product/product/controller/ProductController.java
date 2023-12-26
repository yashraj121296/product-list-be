package com.product.product.controller;

import com.product.product.dao.Product;
import com.product.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.product.product.dao.Product;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = productRepository.findAll();
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody List<Product> products) {
        productRepository.saveAll(products);
        return ResponseEntity.ok("Products added successfully");
    }

    @DeleteMapping("/{name}")
    @Transactional
    public ResponseEntity<String> deleteProduct(@PathVariable String name ){
        Product product = productRepository.findByName(name);
        if (product ==null){
            return new ResponseEntity<>("No product found with name "+name,NOT_FOUND);
        }
        productRepository.deleteByName(name);
        return ResponseEntity.ok("Deleted product with name "+name);
    }

}

