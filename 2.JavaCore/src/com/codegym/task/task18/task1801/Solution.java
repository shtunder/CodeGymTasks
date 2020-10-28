package com.codegym.task.task18.task1801;

import java.io.*;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int maxByte = 0;
        while (fileInputStream.available() > 0) {
            int currByte = fileInputStream.read();
            if (maxByte < currByte) {
                maxByte = currByte;
            }
        }
        System.out.println("Max byte = " + maxByte);
        bufferedReader.close();
        fileInputStream.close();
    }
}
