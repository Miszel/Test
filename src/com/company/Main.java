package com.company;

public class Main {

 static int[] prices = {9,1,1};

    public static float calculateAverage (int prices[]){
        int sum = 0;
        for(int i=0;i<prices.length;i++){
        sum += prices[i];
        }
        float average = (float)sum/prices.length;
        return average;
    }

    public static void main(String[] args) {
       // float[] prices = {4, 7};
	// write your code he
        //Main main = new Main();
                //System.out.println(main.calculateAverage(prices[0],prices[1]));
        System.out.println(calculateAverage(prices));
    }
}
