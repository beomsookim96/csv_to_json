package com.csvtojson.productservice.domain.rec;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Rec{

    //Key

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
    }// Rec()

}// end class

