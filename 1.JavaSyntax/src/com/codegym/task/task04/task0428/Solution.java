package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a>0 && b>0 && c>0){
            System.out.println("3");
        }
        if ((a<=0 || b<=0 || c<=0) && ((a>0 && b>0) || (a>0 && c>0) || (b>0 && c>0))){
            System.out.println("2");
        }
        if ((a>0 && b<=0 && !(c>0)) || (b>0 && a<=0 && c<=0) || (c>0 && a<=0 && b<=0)){
            System.out.println("1");
        }
        if (!(a>0) && !(b>0) && !(c>0)){
            System.out.println("0");
        }

    }
}
