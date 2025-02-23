package com.example.products.business.product;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class Product {
    private String id = UUID.randomUUID().toString();
    private String description;
    private BigDecimal price;
    private int quantity;
    private double width;
    private double height;
    private double depth;
    private double weight;

    public Product() {
    }

    public Product(String description, BigDecimal price, int quantity, double width, double height, double depth, double weight) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

}
