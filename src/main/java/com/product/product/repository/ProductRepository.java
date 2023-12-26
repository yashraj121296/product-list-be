package com.product.product.repository;

import com.product.product.dao.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    @Override
    List<Product> findAll();
    Product findByName(String name);
    void deleteByName(String name);
}
