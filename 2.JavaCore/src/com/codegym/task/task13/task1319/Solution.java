package com.codegym.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedWriter file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));

        String s = "";
        while (true) {
            s = reader.readLine();
            if (s.equals("exit")){
                break;
            }
            file.write(s);
            file.newLine();
        }

        file.close();
        reader.close();
    }
}
