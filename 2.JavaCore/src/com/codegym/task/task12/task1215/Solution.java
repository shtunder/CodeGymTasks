package com.codegym.task.task12.task1215;

/* 
Cats should not be abstract!

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{
        @Override
        public String getName(){
            return "Cat";
        }
        @Override
        public Pet getChild(){
            return new Cat();
        }
    }

    public static class Dog extends Pet{
        @Override
        public String getName(){
            return "Dog";
        }
        @Override
        public Pet getChild(){
            return new Dog();
        }

    }

}
