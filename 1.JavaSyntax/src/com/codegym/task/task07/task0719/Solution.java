package com.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Display numbers in reverse order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            list.add(0, a);
        }
        for (int i = 0; i < 10; i++){
            System.out.println(list.get(i));
        }
    }
}
