package com.eigene.productservice.domain.rec;

import lombok.*;

import javax.persistence.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Rec{

    @EmbeddedId
    private RecId recId;

    //Columns

    @Column
    private Integer score;

    @Column
    private Integer rank;

    @Builder
    public Rec(RecId recId, Integer score, Integer rank) {
        this.recId = recId;
        this.score = score;
        this.rank = rank;
    }// Rec() builder

}// end class Rec

