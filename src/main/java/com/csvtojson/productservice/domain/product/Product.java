package com.csvtojson.productservice.domain.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@JsonIgnoreProperties({"hibernateLazyInitializer"})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Product {

    //PK
    @Id
    private String item_id;

    //Columns
    @Column
    private String item_name;

    @Column
    private String item_image;

    @Column
    private String item_url;

    @Column
    private Integer original_price;

    @Column
    private Integer sale_price;

    @Builder
    public Product(String item_id, String item_name, String item_image, String item_url, Integer original_price, Integer sale_price) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_image = item_image;
        this.item_url = item_url;
        this.original_price = original_price;
        this.sale_price = sale_price;
    } // Product()

} // end class
