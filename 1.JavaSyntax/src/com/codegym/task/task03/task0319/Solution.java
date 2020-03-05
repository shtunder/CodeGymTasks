package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        String snumber1 = bufferedReader.readLine();
        int number1 = Integer.parseInt(snumber1);
        String snumber2 = bufferedReader.readLine();
        int number2 = Integer.parseInt(snumber2);
        System.out.println(name + " will receive " + number1 + " in " + number2 + " years.");
    }
}
