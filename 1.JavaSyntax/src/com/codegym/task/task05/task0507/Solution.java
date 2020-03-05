package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        double sum = 0;
        int k =0;
        while (true){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(bufferedReader.readLine());
            if (a==-1){
                break;
            }
            sum+=a;
            k++;
        }
        double avg = sum/k;
        System.out.println(avg);
    }
}

