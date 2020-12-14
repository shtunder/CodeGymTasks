package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(fileName1);
             FileOutputStream fileOutputStream = new FileOutputStream(fileName2)) {
            byte[] buffer = null;
            if (fileInputStream.available() > 0) {
                buffer = new byte[fileInputStream.available()];
                int n = fileInputStream.read(buffer);
            }

            for (int i = 1; i < buffer.length; i += 2) {
                fileOutputStream.write(buffer[i]);
            }
        }
    }
}
