package com.eigene.productservice.domain.rec;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Rec {

    //FK
    @Id
    private String target_item_id; // Product의 PK 와 FK 관계입니다.

    //Columns
    @Column
    private String result_item_id;

    @Column
    private Integer score;

    @Column
    private Integer rank;

    @Builder
    public Rec(String target_item_id, String result_item_id, Integer score, Integer rank) {
        this.target_item_id = target_item_id;
        this.result_item_id = result_item_id;
        this.score = score;
        this.rank = rank;
    }// Rec() builder

}// end class Rec
