package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        if (n1 < n2){
            System.out.println(n1);
        }
        else if (n1 == n2){
            System.out.println(n1);
        }
        else{
            System.out.println(n2);
        }
    }
}