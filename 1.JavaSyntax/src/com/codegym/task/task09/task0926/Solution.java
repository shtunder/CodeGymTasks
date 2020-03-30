package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here
        ArrayList<int[]> list = new ArrayList<>();

        list.add(new int[]{0,1,2,3,4});
        list.add(new int[]{0,1});
        list.add(new int[]{0,1,2,3});
        list.add(new int[]{0,1,2,3,4,5,6});
        list.add(new int[]{});

//        int[] array0 = new int[5];
//        for (int i = 0; i<5; i++){
//            array0[i]=i;
//        }
//        list.add(array0);
//
//        int[] array1 = new int[2];
//        for (int i = 0; i<2; i++){
//            array1[i]=i;
//        }
//        list.add(array1);
//
//        int[] array2 = new int[4];
//        for (int i = 0; i<4; i++){
//            array2[i]=i;
//        }
//        list.add(array2);
//
//        int[] array3 = new int[7];
//        for (int i = 0; i<7; i++){
//            array3[i]=i;
//        }
//        list.add(array3);
//
//        int[] array4 = new int[0];
//        list.add(array4);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
