package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        Solution one = new Solution();
        one.sortInDescending(a,b,c);
    }

    private void sortInDescending (int a, int b, int c){
        int p1;
        int p2;
        if (a > b) {
            p1 = a;
            p2 = b;
        } else {
            p1 = b;
            p2 = a;
        }

        int p3;
        if (c > p1) {
            p3 = c;
        } else {
            p3 = p1;
            if (c > p2) {
                p1 = c;
            } else {
                p1 = p2;
                p2 = c;
            }
        }
        System.out.println(p3 + " " + p1 + " " + p2);
    }
}
