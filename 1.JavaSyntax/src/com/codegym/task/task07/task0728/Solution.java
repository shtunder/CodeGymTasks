package com.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
In decreasing order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //write your code here

        for (int i = 0; i < array.length; i++)
            for (int j = array.length-1; j>i; j--) {
                if (array[j-1] < array[j]) {
                    int temp = array[j-1];
                    array[j-1]=array[j];
                    array[j] = temp;

                }
            }
    }
}
