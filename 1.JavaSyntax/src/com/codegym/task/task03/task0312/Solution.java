package com.codegym.task.task03.task0312;

/* 
Time conversion

*/

public class Solution {
    //write your code here
    public static int convertToSeconds (int hour){
        int c = hour*60*60;
        return c;
    }

    public static void main(String[] args) {
        //write your code here
        System.out.println(convertToSeconds(24));
        System.out.println(convertToSeconds(16));
    }
}
