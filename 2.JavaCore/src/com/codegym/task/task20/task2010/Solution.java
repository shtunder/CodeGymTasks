package com.codegym.task.task20.task2010;

import java.io.Serializable;

/* 
How do you serialize something of your own?

*/

public class Solution {
    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static int stringCount;

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(String[] args) {

    }
}
