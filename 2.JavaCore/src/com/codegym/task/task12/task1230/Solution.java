package com.codegym.task.task12.task1230;

/* 
Making the top ten

*/

public class Solution {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }

    public static int transformValue(Integer i) {
        return 2 * i;
    }
}
