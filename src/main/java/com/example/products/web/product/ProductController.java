package com.example.products.web.product;

import com.example.products.application.product.FakeProductService;
import com.example.products.business.product.Product;
import com.example.products.infrastructure.mappers.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private static final String BASE_URL = "/products";
    private final FakeProductService fakeProductService;
    private final ProductMapper productMapper;

    @PostMapping(BASE_URL)
    public Product createProduct(@RequestBody ProductForm productForm) {
        return fakeProductService.createProduct(productMapper.toEntityFromForm(productForm));
    }

    @GetMapping(BASE_URL + "/{id}")
    public Product getProduct(@PathVariable("id") String id) {
        return fakeProductService.getProduct(id);
    }

    @DeleteMapping(BASE_URL + "/{id}")
    public void deleteProduct(@PathVariable("id") String id) {
        fakeProductService.deleteProduct(id);
    }

    @GetMapping(BASE_URL)
    public List<Product> getAllProducts() {
        return fakeProductService.getAllProducts();
    }

}
