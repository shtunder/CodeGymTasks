package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //write your code here
        int[] array = new int[20];
        for (int i = 0; i < 20; i++){
            int a = Integer.parseInt(reader.readLine());
            array[i] = a;
        }
        minimum = array[0];
        maximum = array[0];
        for (int i = 0; i < array.length; i++){
            if (minimum > array[i]){
                minimum = array[i];
            }
            if (maximum < array[i]){
                maximum = array[i];
            }
        }


        System.out.print(maximum + " " + minimum);
    }
}
