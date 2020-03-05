package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tmp = -1;
        for (int i=0; i<5; i++){
            String s = reader.readLine();
            if(tmp>s.length() || tmp ==-1){
                tmp = s.length();
            }
            list.add(s);

        }
        for(int i=0; i<list.size(); i++){
            if (tmp==list.get(i).length())
                System.out.println(list.get(i));
        }
    }
}
