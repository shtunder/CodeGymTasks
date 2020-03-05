package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] strings = new String[10];
        int[] nums = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<strings.length; i++){
            strings[i] = reader.readLine();
        }
        for (int i=0; i<nums.length; i++){
            nums[i]=strings[i].length();
        }
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
