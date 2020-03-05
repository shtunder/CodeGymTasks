package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(105));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        int a = number/100;
        int b = number/10 - a*10;
        int c = number - a*100 - b*10;
        int sum = a+b+c;
        return sum;
    }
}