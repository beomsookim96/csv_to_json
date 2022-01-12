package com.eigene.productservice.service;


import com.eigene.productservice.domain.rec.Rec;

import java.util.List;

public interface RecService {

    public abstract List<Rec> getRecsById(String id);

} // end interface
