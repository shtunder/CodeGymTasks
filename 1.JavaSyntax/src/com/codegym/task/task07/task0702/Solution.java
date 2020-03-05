package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];
        for(int i = 0; i<8; i++){
            strings[i]=reader.readLine();
        }
        for (int i=0; i<strings.length; i++){
            System.out.println(strings[9-i]);
        }
    }
}