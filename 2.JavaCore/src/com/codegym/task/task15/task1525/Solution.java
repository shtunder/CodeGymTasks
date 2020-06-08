package com.codegym.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
File in a static block

*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        try {
            BufferedReader fReader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));

            while (fReader.ready()) {
                String s = fReader.readLine();
                lines.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File " + Statics.FILE_NAME + " not found!" );
        } catch (IOException e) {
            System.out.println("ERROR: File "+Statics.FILE_NAME+" can't read!");
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
