package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
             FileInputStream fileInputStream1 = new FileInputStream(fileName2);
             FileInputStream fileInputStream2 = new FileInputStream(fileName3)) {
            while (fileInputStream1.available() > 0) {
                fileOutputStream.write(fileInputStream1.read());
            }
            while (fileInputStream2.available() > 0) {
                fileOutputStream.write(fileInputStream2.read());
            }
        }
    }
}
