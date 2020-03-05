package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int n = Integer.parseInt(s);

        if (n%4==0) {
            if (n%400==0)
                System.out.println("Number of days in the year: 366");
            else if (n%100==0)
                System.out.println("Number of days in the year: 365");
            else
                System.out.println("Number of days in the year: 366");
        }
        else
            System.out.println("Number of days in the year: 365");

    }
}