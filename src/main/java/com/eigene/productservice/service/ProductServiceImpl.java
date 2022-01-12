package com.eigene.productservice.service;

import com.eigene.productservice.domain.product.Product;
import com.eigene.productservice.domain.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{

    ProductRepository productRepository;

    @Override
    public Product getProductById(String id) {
        return productRepository.getById(id);
    }// getProductById()

}// end class
