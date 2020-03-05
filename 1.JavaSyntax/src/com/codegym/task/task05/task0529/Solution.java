package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        while (true){
            String s = bufferedReader.readLine();
            if (s.equals("sum")) {
                break;
            }
            int num = Integer.parseInt(s);
            result = result+num;
        }
        System.out.println(result);
    }
}
