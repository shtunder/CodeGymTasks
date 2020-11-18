package com.codegym.task.task18.task1819;

import java.io.*;

/* 
Combining files

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream fileInputStream1 = new FileInputStream(fileName1);
             FileInputStream fileInputStream2 = new FileInputStream(fileName2)) {

            while (fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }
}
