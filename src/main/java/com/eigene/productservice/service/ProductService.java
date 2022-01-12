package com.eigene.productservice.service;


import com.eigene.productservice.domain.product.Product;

public interface ProductService {

    public abstract Product getProductById(String id);

} // end interface
