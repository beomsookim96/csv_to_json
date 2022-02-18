package com.csvtojson.productservice.dto.product;

import com.csvtojson.productservice.domain.product.Product;
import com.csvtojson.productservice.domain.rec.Rec;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductGetRequestDto {

    private String item_id;
    private String item_name;
    private String item_image;
    private String item_url;
    private Integer original_price;
    private Integer sale_price;
    private Integer score;
    private Integer rank;

    public ProductGetRequestDto(Product product, Rec rec) {
        this.item_id = product.getItem_id();
        this.item_name = product.getItem_name();
        this.item_image = product.getItem_image();
        this.item_url = product.getItem_url();
        this.original_price = product.getOriginal_price();
        this.sale_price = product.getSale_price();
        this.score = rec.getScore();
        this.rank = rec.getRank();
    }// ProductGetRequestDto()

}// end class
