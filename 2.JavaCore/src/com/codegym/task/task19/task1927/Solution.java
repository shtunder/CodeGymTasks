package com.codegym.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Contextual advertising

*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        System.setOut(new PrintStream(byteArrayOutputStream));

        testString.printSomething();

        System.setOut(defaultPrintStream);

        String[] byteArray = byteArrayOutputStream.toString().split("\\n");
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
            if (i % 2 != 0)
                System.out.println("CodeGym - online Java courses");
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}

