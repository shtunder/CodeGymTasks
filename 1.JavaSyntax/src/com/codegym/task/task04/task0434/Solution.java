package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int i = 1;
        while (i<=10){
            int k = 1;
            while ((k*i)<=10*i) {
                System.out.print(k*i + " ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
