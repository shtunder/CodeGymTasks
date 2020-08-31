package com.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName1 = sc.nextLine();
        String fileName2 = sc.nextLine();
//        String fileName1 = "d:\\3.txt";
//        String fileName2 = "d:\\4.txt";

        try {
            BufferedReader file1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));

            while (file1.ready()) {
                allLines.add(file1.readLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName1 + " not found");
        } catch (IOException e) {
            System.out.println("Can't Read File " + fileName1);
        }

        try {
            BufferedReader file2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName2)));

            while (file2.ready()) {
                forRemoveLines.add(file2.readLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName2 + " not found");
        } catch (IOException e) {
            System.out.println("Can't Read File " + fileName2);
        }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            System.out.println("Что-то");
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
            return;
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}