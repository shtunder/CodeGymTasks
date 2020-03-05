package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }

        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i+1).length()<list.get(i).length()){
                System.out.println(i+1);
                break;
            }
        }
    }
}

