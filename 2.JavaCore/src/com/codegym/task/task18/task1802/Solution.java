package com.codegym.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Minimum byte

*/


public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        FileInputStream f = new FileInputStream(reader.nextLine());

        int min = 0;
        if (f.available() > 0)
            min = f.read();
        while (f.available() > 0) {
            int value = f.read();
            if (value < min)
                min = value;

        }
        f.close();
        System.out.println(min);
    }
}