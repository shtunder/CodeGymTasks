package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

//        int tmp;
//        for(int j=4; j>0; j--)
//            for (int i = 0; i < j; i++)
//            {
//                if (nums[i] > nums[i + 1]) {
//                    tmp = nums[i];
//                    nums[i] = nums[i + 1];
//                    nums[i + 1] = tmp;
//                }
//            }

        int tmp;
        for(int i = 0; i<nums.length; i++)
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }


        for(int i = 0; i<5; i++){
            System.out.println(nums[i]);
        }
    }
}
