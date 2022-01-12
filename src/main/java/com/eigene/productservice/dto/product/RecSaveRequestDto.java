package com.eigene.productservice.dto.product;


import com.eigene.productservice.domain.rec.Rec;

import com.eigene.productservice.domain.rec.RecId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class RecSaveRequestDto {

    private RecId recId;
    private Integer rank;
    private Integer score;

    public Rec toEntity(){
        return Rec.builder()
                .recId(recId)
                .rank(rank)
                .score(score)
                .build();
    } // to Entity()

} // end class
