package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int n = Integer.parseInt(s);

        if (n<8 && n>0) {
            if (n==1)
                System.out.println("Monday");
            if (n==2)
                System.out.println("Tuesday");
            if (n==3)
                System.out.println("Wednesday");
            if (n==4)
                System.out.println("Thursday");
            if (n==5)
                System.out.println("Friday");
            if (n==6)
                System.out.println("Saturday");
            if (n==7)
                System.out.println("Sunday");
        }
        else
            System.out.println("No such day of the week");
    }
}