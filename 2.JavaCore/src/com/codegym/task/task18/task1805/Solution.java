package com.codegym.task.task18.task1805;

import java.io.*;
import java.util.ArrayList;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String fileName = reader.readLine();

       FileInputStream inputStream = new FileInputStream(fileName);

        ArrayList<Integer> arrayList = new ArrayList<>();

       while (inputStream.available() > 0) {
           int currByte = inputStream.read();
           arrayList.add(currByte);
       }

       for (int i = 0; i < arrayList.size() - 1; i++) {
           for (int j = i + 1; j < arrayList.size(); j++) {
               if (arrayList.get(i) > arrayList.get(j)) {
                   int temp = (int) arrayList.get(i);
                   arrayList.remove(i);
                   arrayList.add(i, arrayList.get(j));
                   arrayList.remove(j);
                   arrayList.add(j, temp);
               }
           }
       }

       for (int i = 0; i < arrayList.size(); i++){
           System.out.print(arrayList.get(i) + " ");
       }
    }
}
