package com.example.products.application.product;

import com.example.products.business.product.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class FakeProductService {
    private static List<Product> products = new ArrayList<>(List.of(
            new Product("Notebook gamer", BigDecimal.valueOf(3500),1,1500,3500,12,50),
            new Product("Smartphone Tesla", BigDecimal.valueOf(5000),1,1500,3500,12,50),
            new Product("Tablet Tabajara", BigDecimal.valueOf(1000),1,1500,3500,12,50),
            new Product("Headphones Sony", BigDecimal.valueOf(1000),1,1500,3500,12,50)
    ));

    public Product createProduct(Product product) {
        products.add(product);
        return product;
    }

    public Product getProduct(String id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public void deleteProduct(String id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
