package com.eigene.productservice.domain.rec;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import java.io.Serializable;


@Data
@Embeddable
public class RecId implements Serializable {

    private String target_item_id;
    private String result_item_id;

    public RecId(String target_item_id, String result_item_id) {
        this.target_item_id = target_item_id;
        this.result_item_id = result_item_id;
    }// RecId()

    public RecId() {

    }// RecId()

}// end class
