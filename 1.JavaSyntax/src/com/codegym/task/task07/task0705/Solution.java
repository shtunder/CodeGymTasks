package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] nums = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<nums.length; i++){
            nums[i]=Integer.parseInt(reader.readLine());
        }
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        for (int i=0; i<nums1.length; i++)
            nums1[i] = nums[i];
        for (int i=0; i<nums2.length; i++)
            nums2[i]=nums[i+nums1.length];
        for (int i=0; i<nums2.length; i++)
            System.out.println(nums2[i]);
    }
}
