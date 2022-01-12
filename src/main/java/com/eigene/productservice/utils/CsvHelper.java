package com.eigene.productservice.utils;


import com.eigene.productservice.domain.product.Product;
import com.eigene.productservice.domain.rec.Rec;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;

@Component
public class CsvHelper {

    public ArrayList<Product> parseCsvToProductList(){
        ArrayList<Product> productArrayList = new ArrayList<>();
        BufferedReader br = null;
        try {
            try {
                File file = new File("src/main/resources/csv/product.csv");
                FileReader fileReader = new FileReader(file);
                br = new BufferedReader(fileReader);
                String line = "";
                while ((line = br.readLine()) != null){
                    String[] columns = line.replaceAll("\"","").split(",");
                    Product product = new Product(columns[0],columns[1],columns[2],columns[3],Integer.parseInt(columns[4]),Integer.parseInt(columns[5]));
                    productArrayList.add(product);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productArrayList;

    }

    public ArrayList<Rec> parseCsvToRecList(){
        ArrayList<Rec> recArrayList = new ArrayList<>();
        BufferedReader br = null;
        try {
            try {
                File file = new File("src/main/resources/csv/rec.csv");
                FileReader fileReader = new FileReader(file);
                br = new BufferedReader(fileReader);
                String line = "";
                while ((line = br.readLine()) != null){
                    String[] columns = line.replaceAll("\"","").split(",");
                    Rec rec = new Rec(columns[0],columns[1],Integer.parseInt(columns[2]),Integer.parseInt(columns[3]));
                    recArrayList.add(rec);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return recArrayList;

    }

}
