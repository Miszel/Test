package com.company;

public class Exercise14{
    public static Product[] changeType() {

            String formInput = "10;2;1.5";
            String[] result = formInput.split(";");
            Product[] products = new Product[result.length];

            for (int x=0; x<result.length; x++) {

                Product product = new Product();
                product.price = Float.valueOf(result[x]);
                System.out.println("netto product price:" + product.price);
                product.tax = Product.calculateGrossPrice(product.price);
                products[x] = product;
            }
            return products;
        }
/*
        public static float calculateGrossPrice(float net){
            float gross = 0.5f;

            float brutto = (gross*net)+net;
            System.out.println("brutto product price:" + brutto);
            return brutto;
        }*/

        public static float calculateAverage (Product[] tab){

            float sum = 0;
            for (int i=0;i<tab.length;i++) {
                sum+=tab[i].tax;
            }
            return (float)sum/tab.length;

        }

        public static void main(String[] args) {

            Product[] table = changeType();
            float average =calculateAverage(table);
            System.out.println("average of all products:" + average);
        }


    }



