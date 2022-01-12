package com.eigene.productservice.domain.product;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


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
    } // Product() builder

    @Override
    public String toString() {
        return "Product{" +
                "item_id='" + item_id + '\'' +
                ", item_name='" + item_name + '\'' +
                ", item_image='" + item_image + '\'' +
                ", item_url='" + item_url + '\'' +
                ", original_price=" + original_price +
                ", sale_price=" + sale_price +
                '}';
    }
} // end class Product
