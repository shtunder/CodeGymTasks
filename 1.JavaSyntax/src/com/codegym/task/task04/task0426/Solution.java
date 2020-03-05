package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());

        if (a<0 && a%2==0){
            System.out.println("Negative even number");
        }
        else if (a%2==-1){
            System.out.println("Negative odd number");
        }
        else if (a==0){
            System.out.println("Zero");
        }
        else if (a>0 && a%2==0){
            System.out.println("Positive even number");
        }
        else if (a>0 && a%2!=0){
            System.out.println("Positive odd number");
        }
    }
}
