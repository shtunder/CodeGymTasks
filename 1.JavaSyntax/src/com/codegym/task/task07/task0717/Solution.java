package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);

        // Display result
        for (String s : list){
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write your code here
        for (int i = 0; i < list.size();){
            list.add(i+1,list.get(i));
            i+=2;
        }
        return list;
    }
}
