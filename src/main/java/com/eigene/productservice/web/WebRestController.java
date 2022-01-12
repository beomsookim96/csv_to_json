package com.eigene.productservice.web;

import com.eigene.productservice.domain.product.Product;
import com.eigene.productservice.domain.rec.Rec;
import com.eigene.productservice.dto.product.ProductGetRequestDto;
import com.eigene.productservice.service.ProductService;
import com.eigene.productservice.service.RecService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@AllArgsConstructor
@RestController
public class WebRestController {

    ProductService productService;
    RecService recService;

    @GetMapping("/rec")
    public String getProduct(String id){ // DB의 값을 JSON형태로 출력합니다.

        String[] idArr = id.split(","); // 2개 이상의 값도 받도록 split(",")를 통해 문자열 배열로 넣어줍니다.

        ObjectMapper mapper = new ObjectMapper();
        Map<Object,Object> resultMap = new TreeMap<>(Collections.reverseOrder());
        ArrayList<Product> targetArrayList = new ArrayList<>();
        ArrayList<ProductGetRequestDto> resultArrayList = new ArrayList<>();
        String result = "";

        try {

            for (int i = 0; i < idArr.length; i++) {
                for (Rec rec: recService.getRecsById(idArr[i])) {
                    resultArrayList.add(new ProductGetRequestDto(productService.getProductById(rec.getRecId().getResult_item_id()),rec));
                }
                targetArrayList.add(productService.getProductById(idArr[i]));
            }

            resultMap.put("result",resultArrayList);
            resultMap.put("target",targetArrayList);
            result += mapper.writeValueAsString(resultMap);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }// try catch

        return result;

    }// getProduct()
}
