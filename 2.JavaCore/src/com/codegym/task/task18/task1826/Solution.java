package com.codegym.task.task18.task1826;

/* 
Encryption

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
        if (!(mode.equals("-e") || mode.equals("-d"))) return;
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {

            while (fileInputStream.available() > 0) {
                int readByte = fileInputStream.read();
                int changedByte = mode.equals("-e") ? readByte + 32 : readByte - 32;
                fileOutputStream.write(changedByte);
            }

        }
    }
}
