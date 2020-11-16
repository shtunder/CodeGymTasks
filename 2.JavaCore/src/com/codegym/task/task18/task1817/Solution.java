package com.codegym.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Spaces

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int total = 0;
        int spaces = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int readChar = fileReader.read();
                total++;
                if (readChar == (int) ' ') spaces++;
            }
        }
        if (total != 0) {
            double result = (double) spaces / total * 100;
            System.out.printf("%.2f", result);
        }
    }
}
