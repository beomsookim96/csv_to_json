package com.eigene.productservice.web;

import com.eigene.productservice.domain.product.ProductRepository;
import com.eigene.productservice.domain.rec.RecRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
public class WebRestController {

    private ProductRepository productRepository;
    private RecRepository recRepository;

    @GetMapping("/")
    public void saveProduct(String id){

    }
}
