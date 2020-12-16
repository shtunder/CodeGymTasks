package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String inputFileName;
        String outputFileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFileName = reader.readLine();
            outputFileName = reader.readLine();
        }

        ArrayList<String> fileContent = new ArrayList<>();
        try (BufferedReader bFileReader = new BufferedReader(new FileReader(inputFileName))) {
            while (bFileReader.ready()) {
                fileContent.add(bFileReader.readLine());
            }
        }

        try (BufferedWriter bFileWriter = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String line : fileContent) {
                String[] splitLine = line.trim().split(" ");
                for (String word : splitLine) {
                    try {
                        int num = Integer.parseInt(word);
                        bFileWriter.write(word + " ");
                    } catch (Exception e) {
                       
                    }
                }
            }
        }
    }
}
