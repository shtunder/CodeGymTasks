package com.codegym.task.task09.task0905;

/* 
In the blue depths of the stack trace…

*/



public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDepth();
        System.out.println(deep);
    }

    public static int getStackTraceDepth() {
        // write your code here
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements.length;
    }
}

