package com.eigene.productservice.service;


import com.eigene.productservice.domain.rec.Rec;
import com.eigene.productservice.domain.rec.RecRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RecServiceImpl implements RecService{

    RecRepository recRepository;

    @Override
    public Rec getRecsById(String id) {

        return null;
    }
}
