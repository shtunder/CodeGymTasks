package com.codegym.task.task04.task0436;


/* 
Drawing a rectangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
