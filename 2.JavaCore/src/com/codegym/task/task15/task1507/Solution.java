package com.codegym.task.task15.task1507;

/* 
OOP: Method overloading

*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Filling with String objects");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix() {
        int m = 5;
        int n = 5;
        String value = "10";
        printMatrix(m, n, value);
    }

    public static void printMatrix(int m, long n, String value) {
        printMatrix(m, n, value);
    }

    public static void printMatrix(long m, int n, String value) {
        printMatrix(m, n, value);
    }

    public static void printMatrix(int m, int n, Boolean value) {
        printMatrix(m, n, value);
    }

    public static void printMatrix(int m, int n, Short value) {
        printMatrix(m, n, value);
    }

    public static void printMatrix(int m, int n, Integer value) {
        printMatrix(m, n, value);
    }

    public static void printMatrix(int m, int n, Long value) {
        printMatrix(m, n, value);
    }

    public static void printMatrix(int m, int n, Float value) {
        printMatrix(m, n, value);
    }

    public static void printMatrix(int m, int n, Double value) {
        printMatrix(m, n, value);
    }

}
