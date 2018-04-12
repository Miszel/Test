package com.company;

public class Exercise14{
    public static Product[] changeType() {

            String formInput = "10;2";
            String[] result = formInput.split(";");
            Product[] products = new Product[result.length];

            for (int x=0; x<result.length; x++) {

                Product product = new Product();
                product.price = Float.valueOf(result[x]);
                System.out.println("netto product price:" + product.price);
                product.tax = 0.5f;
                System.out.println("tax product :" + product.tax);
                products[x] = product;
            }
            return products;
        }


        public static float calculateAverage (Product[] tab){

            float sum = 0;
            for (int i=0;i<tab.length;i++) {
                float gross = tab[i].calculateGrossPrice();
                sum+=gross;
            }
            return (float)sum/tab.length;

        }

        public static void main(String[] args) {

            Product[] table = changeType();
            float average =calculateAverage(table);
            System.out.println("average of all products:" + average);
        }


    }



