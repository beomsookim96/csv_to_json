package com.csvtojson.productservice.listener;

import com.csvtojson.productservice.domain.product.Product;
import com.csvtojson.productservice.domain.product.ProductRepository;
import com.csvtojson.productservice.domain.rec.Rec;
import com.csvtojson.productservice.domain.rec.RecRepository;
import com.csvtojson.productservice.utils.CsvHelper;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
@AllArgsConstructor
public class StartupApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;
    private RecRepository recRepository;
    private CsvHelper csvHelper;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ArrayList<Product> productArrayList =  csvHelper.parseCsvToProductList();
        ArrayList<Rec> recArrayList = csvHelper.parseCsvToRecList();
        for (Product product : productArrayList) {
            productRepository.save(product);
        }
        for (Rec rec : recArrayList) {
            recRepository.save(rec);
        }
    }// onApplicationEvent()

}// end class
