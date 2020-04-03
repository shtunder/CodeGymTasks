package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here
        ArrayList<String>[] arrayLists = new ArrayList[3];
        for (int i = 0; i < 3; i++){
            arrayLists[i] = new ArrayList<>();
            for (int j = 0; j < 3; j++)
                arrayLists[i].add("String number " + j);
        }
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}