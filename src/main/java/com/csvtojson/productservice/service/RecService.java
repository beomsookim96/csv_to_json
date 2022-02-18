package com.csvtojson.productservice.service;


import com.csvtojson.productservice.domain.rec.Rec;

import java.util.List;

public interface RecService {

    public abstract List<Rec> getRecsById(String id);

} // end interface
