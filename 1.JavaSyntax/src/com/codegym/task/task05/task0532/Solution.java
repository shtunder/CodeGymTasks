package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        if (n<=0){
            System.out.println("Error!");
            return;
        }

        //write your code here
        int maximum = Integer.parseInt(reader.readLine());
        for(int i=0; i<n-1; i++){
            int a = Integer.parseInt(reader.readLine());
            if (a>maximum){
                maximum=a;
            }
        }
        System.out.println(maximum);
    }
}
