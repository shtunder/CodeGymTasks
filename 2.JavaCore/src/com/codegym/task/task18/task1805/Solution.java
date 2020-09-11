package com.codegym.task.task18.task1805;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.TreeSet;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        String filename = reader.nextLine();

        FileInputStream f = new FileInputStream(filename);
        TreeSet<Integer> setSortBytes = new TreeSet<>();

        //read from file
        while (f.available() > 0) {
            setSortBytes.add(f.read());
        }

        f.close();

        //Выводим
        for (int value : setSortBytes)
            System.out.print(value + " ");
    }
}
