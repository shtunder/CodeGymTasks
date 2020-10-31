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

        for (int i = arrayList.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }

        int temp = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == temp) {
                continue;
            }
            System.out.print(arrayList.get(i) + " ");
            temp = arrayList.get(i);
        }
    }
}
