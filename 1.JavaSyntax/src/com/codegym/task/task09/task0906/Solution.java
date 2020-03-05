package com.codegym.task.task09.task0906;

/* 
Logging stack traces

*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String className = stackTraceElements[2].getClassName();
        String methodName = stackTraceElements[2].getMethodName();
        System.out.println(className + ": "+ methodName + ": " + s);
    }
}
