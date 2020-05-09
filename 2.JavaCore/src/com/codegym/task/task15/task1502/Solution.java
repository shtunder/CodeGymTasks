package com.codegym.task.task15.task1502;

/* 
OOP: Animal inheritance

*/

public class Solution {
    // Add the Goose and Dragon classes here

    public static void main(String[] args) {
    }

    public static class BigAnimal {
        protected String getSize() {
            return "like a dinosaur";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "like a cat";
        }
    }

    public static class Goose extends SmallAnimal {
       @Override
        public String getSize() {
           return "A goose is small, " + super.getSize();
       }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            return "A dragon is big, " + super.getSize();
        }
    }
}
