package com.codegym.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Counting commas

*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = reader.readLine();
//        int commaCount = 0;
//        try (FileInputStream inputStream = new FileInputStream(fileName)) {
//            while (inputStream.available() > 0) {
//                if (inputStream.read() == 44)
//                    commaCount++;
//            }
//            System.out.println(commaCount);
//        }
        FileInputStream inputStream = null;
        byte[] buffer = null;

        try {
            String fileName = reader.readLine();
            inputStream = new FileInputStream(fileName);
            int commaCount = 0;

            if (inputStream.available() > 0) {
                buffer = new byte[inputStream.available()];
                int count = inputStream.read(buffer);
                for (int i = 0; i < buffer.length; i++) {
                    if (buffer[i] == 44) commaCount++;
                }
            }
            System.out.println(commaCount);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
