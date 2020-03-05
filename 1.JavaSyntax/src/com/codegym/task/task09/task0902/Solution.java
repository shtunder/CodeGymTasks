package com.codegym.task.task09.task0902;

/* 
Stack trace revisited

*/

import org.w3c.dom.ls.LSOutput;

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();

    }

    public static String method2() {
        method3();
        //write your code here
        StackTraceElement[] stackTracesElements = Thread.currentThread().getStackTrace();
        return stackTracesElements[2].getMethodName();
    }

    public static String method3() {
        method4();
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method5() {
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }
}
