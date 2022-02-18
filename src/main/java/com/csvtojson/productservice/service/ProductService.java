package com.csvtojson.productservice.service;


import com.csvtojson.productservice.domain.product.Product;

public interface ProductService {

    public abstract Product getProductById(String id);

} // end interface
