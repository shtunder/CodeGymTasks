package com.codegym.task.task01.task0131;

/* 
More conversions

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getFeetFromInches(28));
    }

    public static int getFeetFromInches(int inches) {
        //write your code here
        int feet = inches/12;
        return feet;
    }
}