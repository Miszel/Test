package com.company;

import static java.lang.Integer.*;

public class exercise12 {

public static int[] changeType() {
    String formInput = "1;10";
    String[] result = formInput.split(";");
    int[] tabInt = new int[result.length];

    for (int x=0; x<result.length; x++) {
        tabInt[x] = Integer.valueOf(result[x]);

        System.out.println(tabInt[x]);
    }
return tabInt;
     }

    public static float calculateAverage (int[] prices){


                int sum = 0;
        for (int price : prices) {
            sum += price;
        }
        return (float)sum/prices.length;
    }


    public static void main(String[] args) {
        //for (int x: result)
       // System.out.println(x);
        int[] tab = changeType();
        float average =calculateAverage(tab);
        System.out.println("srednia z tablicy to:" + average);
    }


}
