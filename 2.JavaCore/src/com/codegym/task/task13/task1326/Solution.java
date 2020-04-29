package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = null;
        BufferedReader fileReader = null;
        try {
            String s = reader.readLine();
            inputStream = new FileInputStream(s);
            fileReader = new BufferedReader(new InputStreamReader(inputStream));

            while (fileReader.ready()) {
                String str = fileReader.readLine();
                list.add(Integer.parseInt(str));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Can't read file");
        } finally {
            fileReader.close();
            inputStream.close();
        }

        Collections.sort(list);
        for (Integer i : list){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
