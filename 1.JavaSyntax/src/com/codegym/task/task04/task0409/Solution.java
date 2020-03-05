package com.codegym.task.task04.task0409;

/* 
Closest to 10

*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // write your code here
        if (abs(10-a)<abs(10-b))
            System.out.println(a + " is closest to ten");
        else
            System.out.println(b + " is closest to ten");

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}