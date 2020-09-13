package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String fileName = scaner.nextLine();
        int count = 0;
        try {
            FileInputStream f = new FileInputStream (fileName);

            while (f.available() > 0) {
                char ch = (char) f.read();
                if (ch == ',')
                    count++;
            }

            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " not found1");
        } catch (IOException e) {
            System.out.println("File " + fileName + " can't read");
        }

        System.out.println(count);
    }
}
