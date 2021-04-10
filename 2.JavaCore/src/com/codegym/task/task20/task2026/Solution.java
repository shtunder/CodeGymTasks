package com.codegym.task.task20.task2026;

/* 
Rectangle algorithms

*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Must be 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Must be 4");
    }

    public static int getRectangleCount(byte[][] arr) {
        byte[][] a = new byte[arr.length][arr[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = arr[i][j];
            }
        }

        int hor = a[0].length;
        int ver = a.length;
        int count;
        int verEnd;
        int horEnd;
        int result = 0;
        for (int i = 0; i < ver; i++) {
            for (int j = 0; j < hor; j++) {
                if (a[i][j] == 1) {
                    verEnd = i;
                    horEnd = j;
                    // vertically
                    count = i + 1;
                    System.out.println("a[" + count + "][" + j + "]");
                    while (true) {
                        if (count >= ver || (a[count][j] == 0 && count < ver)) {
                            verEnd = count - 1;
                            System.out.println("verEnd = " + verEnd);
                            break;
                        }
                        count++;
                        System.out.println("a[" + count + "][" + j + "]");
                    }
                    // horizontally
                    count = j + 1;
                    while (true) {
                        if (count >= hor || (a[i][count] == 0 && count < hor)) {
                            horEnd = count - 1;
                            System.out.println("horEnd = " + horEnd);
                            break;
                        }
                        count++;
                    }
                    boolean flag = true;
                    for (int p = i; p <= verEnd; p++)
                        for (int q = j; q <= horEnd; q++)
                            if (a[p][q] != 1) {
                                flag = false;
                                break;
                            }
                    if (flag) {
                        System.out.println("startI = " + i);
                        System.out.println("startJ = " + j);
                        System.out.println("endI = " + verEnd);
                        System.out.println("endJ = " + horEnd);
                        for (int p = i; p <= verEnd; p++)
                            for (int q = j; q <= horEnd; q++)
                                a[p][q] = 0;
                        result++;
                    }
                    System.out.println();
                }
            }
        }
        return result;
    }
}
