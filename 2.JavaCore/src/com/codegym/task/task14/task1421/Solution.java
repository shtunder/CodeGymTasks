package com.codegym.task.task14.task1421;

/* 
Singleton

*/
public class Solution {
    public static void main(String[] args) {
        Singleton one = Singleton.getInstance();
        Singleton two = Singleton.getInstance();
        System.out.println(one);
        System.out.println(two);
    }
}
