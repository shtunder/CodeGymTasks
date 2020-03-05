package com.codegym.task.task05.task0530;

import java.io.*;

/* 
Boss, something weird is happening

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = reader.read();

        int sum = a + b;
        char result = (char) sum;
        System.out.println("Sum = " + result);
    }
}
