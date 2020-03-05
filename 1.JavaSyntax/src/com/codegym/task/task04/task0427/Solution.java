package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sa = bufferedReader.readLine();
        int a = Integer.parseInt(sa);

        if (sa.length()==1){
            if (a%2==0) {
                System.out.println("even single-digit number");
            }
            else{
                System.out.println("odd single-digit number");
            }
        }

        else if (sa.length()==2){
            if (a%2==0){
                System.out.println("even two-digit number");
            }
            else {
                System.out.println("odd two-digit number");
            }
        }

        else if (sa.length()==3){
            if (a%2==0){
                System.out.println("even three-digit number");
            }
            else {
                System.out.println("odd three-digit number");
            }
        }

    }
}
