package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
            if (args[0].equals("-e")) {
                while (fileInputStream.available() > 0) {
                    int readByte = fileInputStream.read();
                    int changedByte = readByte + 15;
                    fileOutputStream.write(changedByte);
                }
            } else if (args[0].equals("-d")) {
                while (fileInputStream.available() > 0) {
                    int readByte = fileInputStream.read();
                    int changedByte = readByte - 15;
                    fileOutputStream.write(changedByte);
                }
            }
        }

    }

}
