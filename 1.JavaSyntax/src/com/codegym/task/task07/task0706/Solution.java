package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] array = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<array.length; i++)
            array[i]=Integer.parseInt(reader.readLine());

        int sumEven = 0;
        int sumOdd = 0;
        for (int i=0; i<array.length; i++){
            if (i%2==0) {
                sumEven += array[i];
            }
            else {
                sumOdd += array[i];
            }
        }

        if (sumEven>sumOdd){
            System.out.println("Even-numbered houses have more residents.");
        }
        else {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}
