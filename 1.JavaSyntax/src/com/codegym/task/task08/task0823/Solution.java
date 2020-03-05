package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //write your code here
        String [] words = s.split(" ");
        for (String word: words) {
            StringBuffer str = new StringBuffer(word);
            char a = Character.toUpperCase(str.charAt(0));
            str.setCharAt(0, a);
            System.out.print(str + " ");
        }
    }
}
