package com.eigene.productservice.utils;


import com.eigene.productservice.domain.product.Product;
import com.eigene.productservice.domain.rec.Rec;
import com.eigene.productservice.domain.rec.RecId;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;

@Component
public class CsvHelper {

    public ArrayList<Product> parseCsvToProductList(){// csv를 ArrayList<Product>로 가공합니다.

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
                    Product product = Product.builder()
                            .item_id(columns[0])
                            .item_name(columns[1])
                            .item_image(columns[2])
                            .item_url(columns[3])
                            .original_price(Integer.parseInt(columns[4]))
                            .sale_price(Integer.parseInt(columns[5]))
                            .build();
                    productArrayList.add(product);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                br.close();
            }// try catch finally
        } catch (IOException e) {
            e.printStackTrace();
        }// try catch

        return productArrayList;

    }// parseCsvToProductList()

    public ArrayList<Rec> parseCsvToRecList(){ //csv를 ArrayList<Rec>로 가공합니다.

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
                    RecId recId = new RecId(columns[0],columns[1]);
                    Rec rec = Rec.builder()
                            .recId(recId)
                            .rank(Integer.parseInt(columns[2]))
                            .score(Integer.parseInt(columns[3]))
                            .build();
                    recArrayList.add(rec);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                br.close();
            }//try catch finally
        } catch (IOException e) {
            e.printStackTrace();
        }//try catch

        return recArrayList;

    }// parseCsvToRecList()

}// end class
