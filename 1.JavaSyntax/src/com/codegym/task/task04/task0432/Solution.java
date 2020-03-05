package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int k = Integer.parseInt(bufferedReader.readLine());

        int i = 0;
        while (i<k){
            System.out.println(s);
            i++;
        }

    }
}
