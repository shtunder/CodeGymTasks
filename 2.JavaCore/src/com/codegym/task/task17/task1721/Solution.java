package com.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = "";
        String fileName2 = "";
        try {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
        } catch (IOException e) {
            System.out.println("Can't read file name");
        }

        try {
            BufferedReader file1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));

            while (file1.ready()) {
                allLines.add(file1.readLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName1 + " not found");
        } catch (IOException e) {
            System.out.println("Can't read file " + fileName1);
        }

        try {
            BufferedReader file2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName2)));

            while (file2.ready()) {
                linesForRemoval.add(file2.readLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName2 + " not found");
        } catch (IOException e) {
            System.out.println("Can't read file " + fileName2);
        }
    }


    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(linesForRemoval)) {
            allLines.removeAll(linesForRemoval);
            return;
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
