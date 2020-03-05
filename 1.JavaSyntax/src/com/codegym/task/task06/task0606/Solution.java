package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        while (num != 0){
            if ((num%10)%2==0){
                even++;
            }
            else {
                odd++;
            }
            num=num/10;
        }

        System.out.println("Even: " + even + " Odd: " +  odd);
    }
}
