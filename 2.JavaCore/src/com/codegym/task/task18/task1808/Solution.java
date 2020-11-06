package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
//        Scanner fileName1 = new Scanner(System.in);
//        Scanner fileName2 = new Scanner(System.in);
//        Scanner fileName3 = new Scanner(System.in);
//
//        FileInputStream inputStream1 = new FileInputStream(fileName1.nextLine());
//        FileOutputStream outputStream2 = new FileOutputStream(fileName2.nextLine());
//        FileOutputStream outputStream3 = new FileOutputStream(fileName3.nextLine());
//
//        if (inputStream1.available() > 0) {
//            byte[] buffer = new byte[inputStream1.available()];
//            int count = inputStream1.read(buffer);
//            int size;
//            if (count % 2 == 0) {
//                size = count / 2;
//            } else {
//                size = count / 2 + 1;
//            }
//            byte[] byteArray2 = new byte[size];
//            for (int i = 0; i < size; i++) {
//                byteArray2[i] = buffer[i];
//            }
//            byte[] byteArray3 = new byte[buffer.length - size];
//            for (int i = size; i < buffer.length; i++) {
//                byteArray3[i-size] = buffer[i];
//            }
//            outputStream2.write(byteArray2);
//            outputStream3.write(byteArray3);
//        }
//        inputStream1.close();
//        outputStream2.close();
//        outputStream3.close();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile1 = reader.readLine();
        String outputFile2 = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream1 = new FileOutputStream(outputFile1);
             FileOutputStream fileOutputStream2 = new FileOutputStream(outputFile2)) {

            int halfOfFile = (fileInputStream.available() + 1) / 2;
            int numberOfByte = 0;
            while (fileInputStream.available() > 0) {
                if (numberOfByte < halfOfFile) {
                    fileOutputStream1.write(fileInputStream.read());
                    numberOfByte++;
                }
                else fileOutputStream2.write(fileInputStream.read());
            }
        }
    }
}
