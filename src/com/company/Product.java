package com.company;

public class Product {
    float price;
    float tax;

      float calculateGrossPrice(){

        float gross = (tax*price)+price;
        System.out.println("brutto product price:" + gross);
        return gross;
    }


}
