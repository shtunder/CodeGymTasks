package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        System.out.println(convertEurToUsd(10,1.3));
        System.out.println(convertEurToUsd(20,1.4));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //write your code here
        double c = eur * exchangeRate;

        return c;
    }
}
