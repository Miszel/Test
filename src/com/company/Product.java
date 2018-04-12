package com.company;

public class Product {
    float price;
    float tax;

    public static float calculateGrossPrice(float net){
        float gross = 0.5f;

        float brutto = (gross*net)+net;
        System.out.println("brutto product price:" + brutto);
        return brutto;
    }


}
