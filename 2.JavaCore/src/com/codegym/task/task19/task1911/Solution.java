package com.codegym.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Reader wrapper

*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(byteArrayOutputStream);
        System.setOut(newPrintStream);

        testString.printSomething();

        System.setOut(defaultPrintStream);

        String result = byteArrayOutputStream.toString().toUpperCase();
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}
