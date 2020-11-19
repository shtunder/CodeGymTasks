package com.codegym.task.task18.task1820;

import java.io.*;

/* 
Rounding numbers

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName1));
             PrintWriter printWriter = new PrintWriter(new FileWriter(fileName2))) {

            while (bufferedFileReader.ready()) {
                String[] splittedLine = bufferedFileReader.readLine().split(" ");
                for (String numberInString : splittedLine) {
                    double number = Double.parseDouble(numberInString);
                    long roundedNumber = Math.round(number);
                    printWriter.print(roundedNumber + " ");
                }
            }
        }
    }
}
