package com.company;

public class Exercise13 {

    public static Product[] changeType() {

        String formInput = "1.5;2.5;3";
        String[] result = formInput.split(";");
        Product[] products = new Product[result.length];

        for (int x=0; x<result.length; x++) {
            Product product = new Product();
            product.price = Float.valueOf(result[x]);
            products[x]=product;

            System.out.println(products[x].price);
        }
        return products;
    }

   public static float calculateAverage (Product[] x){

        int sum = 0;
        for (int i=0;i<x.length;i++) {
            sum+=x[i].price;
        }
        return (float)sum/x.length;
        //aa
    }


    public static void main(String[] args) {

        Product[] tab = changeType();
        float average =calculateAverage(tab);
        System.out.println("srednia z tablicy to:" + average);
    }


}