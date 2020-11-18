package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        try (FileInputStream fio2 = new FileInputStream(fileName2);
             FileInputStream fio1 = new FileInputStream(fileName1);
             FileOutputStream foo1 = new FileOutputStream(fileName1)) {

            while (fio2.available() > 0) {
                
            }
        }

    }
}
