package com.codegym.task.task09.task0903;

/* 
Who called me?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return stackTraceElement[2].getLineNumber();
    }
}
