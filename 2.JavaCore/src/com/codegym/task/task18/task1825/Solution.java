package com.codegym.task.task18.task1825;

import java.io.*;
import java.sql.SQLOutput;
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
        Set<String> files = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] parts1 = o1.split(".part");
                String[] parts2 = o2.split(".part");
                int number1 = Integer.parseInt(parts1[parts1.length - 1]);
                int number2 = Integer.parseInt(parts2[parts2.length - 1]);
                return number1 - number2;
            }
        });
        String outputFile = null;
        String readString;
        while (!(readString = reader.readLine()).equals("end")) {
            files.add(readString);
            if (outputFile == null) {
                int indexOfSuffix = readString.lastIndexOf(".part");
                outputFile = readString.substring(0, indexOfSuffix);
            }
        }
        if (outputFile == null) return;
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            for (String file : files) {
                try (FileInputStream fileInputStream = new FileInputStream(file)) {
                    byte[] buffer = new byte[fileInputStream.available()];
                    while (fileInputStream.available() > 0) {
                        int bytesRead = fileInputStream.read(buffer);
                        fileOutputStream.write(buffer, 0, bytesRead);
                    }
                }
            }
        }

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> fileNames = new ArrayList<>();
//        String str;
//
//        while (!(str = reader.readLine()).equals("end")) {
//            fileNames.add(str);
//        }
//
//        for (int i = 1; i < fileNames.size() + 1; i++) {
//            for (int j = 0; j < fileNames.size(); j++) {
//                if (fileNames.get(j).contains("part" + i)) {
//                    try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileNames.get(j)));
//                         BufferedWriter bufferedFileWriter = new BufferedWriter(new FileWriter("D:/test/general.txt", true))) {
//                        while (bufferedFileReader.ready()) {
//                            String line = bufferedFileReader.readLine();
//                            bufferedFileWriter.write(line + "\n");
//                        }
//                    }
//                }
//            }
//        }

    }
}
