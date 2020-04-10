package com.codegym.task.task12.task1207;

/* 
int and Integer

*/

public class Solution {
    public static void main(String[] args) {
        print(5);
        print(new Integer(5));
    }

    //write your code here
    public static void print(int a){
        System.out.println(a + " - int");
    }

    public static void print(Integer a){
        System.out.println(a + " - Integer");
    }
}
