package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        String s3 = bufferedReader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);

        if (a<b+c) {
            if (b < a + c) {
                if (c < a + b) {
                    System.out.println("The triangle is possible.");
                }
                else {
                    System.out.println("The triangle is not possible.");
                }
            }
            else {
                System.out.println("The triangle is not possible.");
            }
        }
        else {
            System.out.println("The triangle is not possible.");
        }

    }
}