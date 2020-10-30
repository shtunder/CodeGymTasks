package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int[] arrayCounts = new int[256];

        while (fileInputStream.available() > 0) {
            int currByte = fileInputStream.read();
            arrayCounts[currByte]++;
        }

        int min = 256;
        for (int i = 1; i < arrayCounts.length; i++) {
            if (arrayCounts[i] != 0 && arrayCounts[i] < min) {
                min = arrayCounts[i];
            }
        }

        for (int i = 0; i < arrayCounts.length; i++) {
            if (arrayCounts[i] == min) {
                System.out.print((char) i + " ");
            }
        }

        fileInputStream.close();
    }
}
