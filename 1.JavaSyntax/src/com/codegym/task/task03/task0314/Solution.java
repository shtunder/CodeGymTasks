package com.codegym.task.task03.task0314;

/* 
Multiplication table

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        int i = 0;
        while (i<10) {
           i=i+1;
           int a = i;
           System.out.print(i+" ");
              while (a<10*i) {
                a=a+i;
                System.out.print(a+" ");
           }
            System.out.println();
        }
    }
}
