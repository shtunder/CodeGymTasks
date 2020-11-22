package com.codegym.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readString;
        while (!(readString = reader.readLine()).equals("exit")) {
            new ReadThread(readString).start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            byte[] bytesCount = new byte[256];
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                while (fileInputStream.available() > 0) {
                    int aByte = fileInputStream.read();
                    bytesCount[aByte]++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            int maxCount = 0;
            int maxCountByte = 0;
            for (int i = 0; i < bytesCount.length; i++) {
                if (bytesCount[i] > maxCount) {
                    maxCount = bytesCount[i];
                    maxCountByte = i;
                }
            }
            resultMap.put(fileName, maxCountByte);
        }
    }
}
