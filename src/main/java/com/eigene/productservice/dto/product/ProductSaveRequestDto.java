package com.eigene.productservice.dto.product;

import com.eigene.productservice.domain.product.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ProductSaveRequestDto {

    private String item_id;
    private String item_name;
    private String item_image;
    private String item_url;
    private Integer original_price;
    private Integer sale_price;

    public Product toEntity(){
        return Product.builder()
                .item_id(item_id)
                .item_name(item_name)
                .item_image(item_image)
                .item_url(item_url)
                .original_price(original_price)
                .sale_price(sale_price)
                .build();
    } // toEntity()

} // end class
