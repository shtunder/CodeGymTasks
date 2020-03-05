package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();

        if (s1.equals(s2)){
            System.out.println("The names are identical");
        }
        else if (s1.length() == s2.length()){
            System.out.println("The names are the same length");
        }
    }
}
