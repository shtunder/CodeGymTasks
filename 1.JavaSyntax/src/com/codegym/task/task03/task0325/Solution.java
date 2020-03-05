package com.codegym.task.task03.task0325;

import java.io.*;

/* 
Financial expectations

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sn = bufferedReader.readLine();
        int n = Integer.parseInt(sn);
        System.out.println("I will earn $" + n + " per hour");
    }
}
