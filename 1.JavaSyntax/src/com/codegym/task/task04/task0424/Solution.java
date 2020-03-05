package com.codegym.task.task04.task0424;

/* 
Three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a!=b && b==c){
            System.out.println("1");
        }
        else if (b!=a && a==c){
            System.out.println("2");
        }
        else if (c!=b && a==b){
            System.out.println("3");
        }
    }
}
