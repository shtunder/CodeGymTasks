package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[20];

        for(int i=0; i<nums.length; i++){
            nums[i]=Integer.parseInt(reader.readLine());
        }

        return nums;
    }

    public static int max(int[] array) {
        // Find the maximum
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
