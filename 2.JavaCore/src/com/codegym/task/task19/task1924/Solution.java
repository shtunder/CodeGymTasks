package com.codegym.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Replacing numbers

*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(12, "twelve");
        map.put(11, "eleven");
        map.put(10, "ten");
        map.put(9, "nine");
        map.put(8, "eight");
        map.put(7, "seven");
        map.put(6, "six");
        map.put(5, "five");
        map.put(4, "four");
        map.put(3, "three");
        map.put(2, "two");
        map.put(1, "one");
        map.put(0, "zero");
    }

    public static void main(String[] args) {
        String fileName = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException ignored) {
        }

        String fileLine;
        ArrayList<String> fileContent = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            while ((fileLine = in.readLine()) != null) {
                fileContent.add(fileLine);
            }
        } catch (IOException ignored) {
        }

        for (String line : fileContent) {
            String[] splitedLine = line.split(" ");
            for (int i = 0; i < splitedLine.length; i++) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    try {
                        int number = Integer.parseInt(splitedLine[i]);
                        if (entry.getKey().equals(number))
                            splitedLine[i] = entry.getValue();
                    } catch (NumberFormatException ignored) {
                    }
                }
            }

            StringBuilder sbLine = new StringBuilder();
            for (String word : splitedLine) {
                sbLine.append(word).append(" ");
            }

            System.out.println(sbLine.toString().trim());
        }
    }
}
