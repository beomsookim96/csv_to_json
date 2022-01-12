package com.eigene.productservice.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, String> {
} //end interface ProductRepository
