package com.eigene.productservice.web;

import com.eigene.productservice.domain.rec.Rec;
import com.eigene.productservice.service.ProductService;
import com.eigene.productservice.service.RecService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
public class WebRestController {

    ProductService productService;
    RecService recService;

    @GetMapping("/rec")
    public void getProduct(String id){

        System.out.println(productService.getProductById(id));
        for (Rec r: recService.getRecsById(id)) {
            System.out.println(r);
        }
    }
}
