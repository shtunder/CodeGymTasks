package com.codegym.task.task19.task1921;

import java.util.ArrayList;
import java.util.List;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) {
        String fileName = args[0];

        ArrayList<String> fileContent = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String fileLine;
            while ((fileLine = fileReader.readLine()) != null)
                fileContent.add(fileLine);

        }
    }
