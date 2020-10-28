package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int minByte = fileInputStream.read();
        while (fileInputStream.available() > 0) {
            int currByte = fileInputStream.read();
            if (minByte > currByte)
                minByte = currByte;
        }
        System.out.println("Min byte = " + minByte);
        reader.close();
    }
}
