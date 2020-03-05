package com.codegym.task.task04.task0425;

/* 
Target locked!

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(bufferedReader.readLine());
        int y = Integer.parseInt(bufferedReader.readLine());

        if (x > 0 && y > 0){
            System.out.println("1");
        }
        else if (x < 0 && y > 0){
            System.out.println("2");
        }
        else if (x < 0 && y < 0){
            System.out.println("3");
        }
        else if (x > 0 && y < 0){
            System.out.println("4");
        }
    }
}
