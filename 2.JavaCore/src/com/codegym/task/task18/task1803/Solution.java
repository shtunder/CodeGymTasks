package com.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Most frequent bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        HashMap<Integer, Integer> byteCounters = new HashMap<>();

        while (inputStream.available() > 0) {
            int currByte = inputStream.read();
            if (byteCounters.containsKey(currByte)) {
                Integer counter = byteCounters.get(currByte);
                counter++;
                byteCounters.put(currByte, counter);
            } else
                byteCounters.put(currByte, 1);
        }
        inputStream.close();

        Integer maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : byteCounters.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }
        }

        ArrayList<Integer> maxValues = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : byteCounters.entrySet()) {
            if (entry.getValue().equals(maxValue))
                maxValues.add(entry.getKey());
        }

        System.out.print("Bytes ");
        for (Integer item : maxValues) {
            System.out.print(item + " ");
        }

        System.out.println("with the maximum number of repetitions = " + maxValue);
    }
}
