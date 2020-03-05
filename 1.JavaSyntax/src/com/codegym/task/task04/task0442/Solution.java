package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        boolean inExit = false;
        int sum = 0;
        while (!inExit){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int a = Integer.parseInt(br.readLine());
            sum=sum+a;

            inExit = (a==-1);
        }
        System.out.println(sum);
    }
}
