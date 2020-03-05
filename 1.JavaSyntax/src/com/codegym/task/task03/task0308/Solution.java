package com.codegym.task.task03.task0308;

/* 
Product of 10 numbers

*/

public class Solution {

    public static int fact (int a){
        if (a<0)
            return 0;
        if (a==0)
            return 1;
        else
            return (a*fact(a-1));
    }

    public static void main(String[] args) {
        //write your code here

        System.out.println(fact(0));
    }

}
