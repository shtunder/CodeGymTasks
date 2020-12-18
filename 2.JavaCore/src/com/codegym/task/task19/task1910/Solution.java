package com.codegym.task.task19.task1910;

/* 
Punctuation

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
                bFileWriter.write(line.replaceAll("\\p{P}", ""));
            }
        }
    }
}
