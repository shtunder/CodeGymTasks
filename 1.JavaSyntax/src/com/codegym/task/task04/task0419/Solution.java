package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());

        int p1;
        if (a >= b) {
            p1 = a;
        } else {
            p1 = b;
        }

        int p2;
        if (c >= d) {
            p2 = c;
        } else {
            p2 = d;
        }

        if (p1 >= p2) {
            System.out.println(p1);
        } else {
            System.out.println(p2);
        }
    }
}