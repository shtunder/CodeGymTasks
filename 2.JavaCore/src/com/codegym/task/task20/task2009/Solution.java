package com.codegym.task.task20.task2009;

import java.io.Serializable;

/* 
How do you serialize static fields?

*/

public class Solution {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }

    public static void main(String[] args) {

    }
}
