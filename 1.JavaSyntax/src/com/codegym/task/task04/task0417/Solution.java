package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        String s3 = bufferedReader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);

        if (a==b){
            if (b==c) {
                System.out.println(a + " " + b + " " + c);
            }
            else{
                System.out.println(a + " " + b);
            }
        }
        else if (a==c){
            System.out.println(a + " " + c);
        }
        else if (b==c){
            System.out.println(b + " " + c);
        }
        else{
            System.out.println("A pair not exists");
        }

    }
}