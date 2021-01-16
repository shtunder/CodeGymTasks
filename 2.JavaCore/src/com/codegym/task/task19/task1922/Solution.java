package com.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Searching for the right lines

*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args) {
        String file1 = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();

        } catch (IOException ignore) {
            /* NOP */
        }

        try (BufferedReader in = new BufferedReader(new FileReader(file1))) {
            while (in.ready()) {
                String readedString = in.readLine();
                String[] splitedReadedString = readedString.split(" ");

                int wordCount = 0;
                for (String s : splitedReadedString) {
                    if (words.contains(s)) {
                        wordCount++;
                    }
                }

                if (wordCount == 2)
                    System.out.println(readedString);
            }
        } catch (IOException ignore) {
            /* NOP */
        }
    }
}
