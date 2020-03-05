package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int k = 0;
        for (int i = 0; i<3; i++){
            int a = Integer.parseInt(bufferedReader.readLine());
            if (a>0){
                k++;
            }
        }
        System.out.println("Number of positive numbers: " + k);
        System.out.println("Number of negative numbers: " + (3-k));
    }
}
