package com.product.product.dao;

import jakarta.persistence.*;

@Entity
@Table( name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 0L;

    @Column
    private String name = "";
    @Column
    private String category = "";

    @Column
    private Double price = 0.0;
    @Column
    private Boolean stocked = false;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", isStocked=" + stocked +
                '}';
    }

    public Product() {
        // Default constructor for JPA
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getStocked() {
        return stocked;
    }

    public Product(String name, String category, Double price, Boolean stocked) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stocked = stocked;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStocked(Boolean stocked) {
        this.stocked = stocked;
    }
}
