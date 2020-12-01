package com.codegym.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Building a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fileNames = new ArrayList<>();
        String str;

        while (!(str = reader.readLine()).equals("end")) {
            fileNames.add(str);
        }

        for (int i = 0; i < fileNames.size(); i++) {
            for (int j = 0; j < fileNames.size(); j++) {
                if (fileNames.get(j).contains("part" + i)) {
                    try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileNames.get(j)));
                         BufferedWriter bufferedFileWriter = new BufferedWriter(new FileWriter("general.txt"))) {
                        while (bufferedFileReader.ready()) {
                            String line = bufferedFileReader.readLine();
                            bufferedFileWriter.write(line);
                        }
                    }
                }
            }
        }

    }
}
