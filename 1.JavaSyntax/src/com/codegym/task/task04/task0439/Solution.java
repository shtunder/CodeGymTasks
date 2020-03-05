package com.codegym.task.task04.task0439;

/* 
Chain letter

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();

        for (int i=0; i<10; i++){
            System.out.println(name + " loves me.");
        }

    }
}
