package com.example.products.infrastructure.mappers;

import com.example.products.business.product.Product;
import com.example.products.web.product.ProductForm;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        injectionStrategy = InjectionStrategy.FIELD
)
public interface ProductMapper {
    Product toEntityFromForm(ProductForm form);
}
