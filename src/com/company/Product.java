package com.company;

public class Product {
    float price;
    float tax;

     float calculateGrossPrice(){

        float brutto = (tax*price)+price;
        System.out.println("brutto product price:" + brutto);
        return brutto;
    }


}
