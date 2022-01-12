package com.eigene.productservice.web;

import com.eigene.productservice.domain.product.ProductRepository;
import com.eigene.productservice.dto.product.ProductSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class WebRestController {

    private ProductRepository productRepository;

    @GetMapping("/")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/csv")
    public void insertCsv(){
        //1. csv를 db에 저장
    }

    @PostMapping("/rec")
    public void savePosts(@RequestBody ProductSaveRequestDto dto){
        productRepository.save(dto.toEntity());
        //2. db에 저장된 정보를 불러와서 화면에 JSON 형태로 뿌려줌
    }

}
