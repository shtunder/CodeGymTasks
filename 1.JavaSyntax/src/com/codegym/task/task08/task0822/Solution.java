package com.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Minimum of N numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Find the minimum here
        int a = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (a > array.get(i)) {
                a = array.get(i);
            }
        }
        return a;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Create and initialize a list here
        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        return list;
    }
}
