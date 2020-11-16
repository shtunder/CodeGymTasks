package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
            if (fileInputStream.available() > 0) {
                byte[] buffer = new byte[fileInputStream.available()];
                int countAll = fileInputStream.read(buffer);
                int countSpaces = 0;
                for (int i = 0; i < buffer.length; i++) {
                    if (buffer[i] == 32) {
                        countSpaces++;
                    }
                }
                countSpaces / cou
            }

        }
    }
}
