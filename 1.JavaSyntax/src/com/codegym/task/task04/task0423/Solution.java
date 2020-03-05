package com.codegym.task.task04.task0423;

/* 
Bouncer policy

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());

        if (age >= 20){
            System.out.println("18 is old enough");
        }
    }
}
