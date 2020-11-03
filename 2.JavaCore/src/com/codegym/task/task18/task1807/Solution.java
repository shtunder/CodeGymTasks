package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            FileInputStream inputStream = new FileInputStream("D:/test.txt");
            int res = 0;
            if (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                int count = inputStream.read(buffer);

                for (int i = 0; i < buffer.length; i++) {
                    if (buffer[i] == 44) {
                        res++;
                    }
                }
            }
            System.out.println(res);
            inputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
