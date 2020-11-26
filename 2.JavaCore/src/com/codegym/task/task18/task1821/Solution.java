package com.codegym.task.task18.task1821;

import java.io.FileInputStream;
import java.io.IOException;

/* 
Symbol frequency

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        byte[] aSCII = new byte[128];
        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                aSCII[data]++;
            }
            for (int i = 0; i < aSCII.length; i++) {
                if (aSCII[i] != 0) {
                    System.out.println((char) i + " " + aSCII[i]);
                }
            }
        }
    }
}
