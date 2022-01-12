package com.eigene.productservice.dto.product;

import com.eigene.productservice.domain.product.Product;
import com.eigene.productservice.domain.rec.Rec;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class RecSaveRequestDto {

    private String target_item_id;
    private String result_item_id;
    private Integer rank;
    private Integer score;

    public Rec toEntity(){
        return Rec.builder()
                .target_item_id(target_item_id)
                .result_item_id(result_item_id)
                .rank(rank)
                .score(score)
                .build();
    } // to Entity()

} // end class RecSaveRequestDto
