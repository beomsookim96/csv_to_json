package com.csvtojson.productservice.service;

import com.csvtojson.productservice.domain.product.Product;
import com.csvtojson.productservice.domain.product.ProductRepository;
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
