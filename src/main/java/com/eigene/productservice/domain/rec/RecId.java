package com.eigene.productservice.domain.rec;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import java.io.Serializable;

/**
 * Created by KBS.
 * User: KBS
 * Date: 1/13/2022
 * Time: 오전 2:22
 */
@Embeddable
public class RecId implements Serializable {

    private String target_item_id;

    private String result_item_id;

    public RecId(String target_item_id, String result_item_id) {
        this.target_item_id = target_item_id;
        this.result_item_id = result_item_id;
    }

    public RecId() {

    }
}
