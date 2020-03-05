package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int strMaxLen = 0;

        for (int i=0;  i<5; i++){
            String s = reader.readLine();
            if (s.length()>strMaxLen){
                strMaxLen = s.length();
            }
            strings.add(s);
        }

        for(int i=0; i<strings.size(); i++){
            if (strings.get(i).length()==strMaxLen)
                System.out.println(strings.get(i));
        }

    }
}
