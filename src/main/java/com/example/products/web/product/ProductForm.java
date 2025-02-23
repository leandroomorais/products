package com.example.products.web.product;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductForm {
    private String description;
    private BigDecimal price;
    private int quantity;
    private double width;
    private double height;
    private double depth;
    private double weight;
}
