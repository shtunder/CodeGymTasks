package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        while (a != 0 && b != 0){
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        System.out.println(a + b);
    }
}
