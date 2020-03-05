package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        double d = Double.parseDouble(s);

        double a = d%5;

        if (a>=0 && a<3) {
            System.out.println("green");
        }
        else if (a>=3 && a<4){
            System.out.println("yellow");
        }
        else {
            System.out.println("red");
        }
    }
}