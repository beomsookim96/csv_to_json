package com.eigene.productservice.service;


import com.eigene.productservice.domain.rec.Rec;
import com.eigene.productservice.domain.rec.RecRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class RecServiceImpl implements RecService{

    RecRepository recRepository;

    @Override
    public List<Rec> getRecsById(String id) {

        return recRepository.get(id);
    }
}
