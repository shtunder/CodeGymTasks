package com.codegym.task.task06.task0603;

/* 
Cat and Dog objects: 50,000 each

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here

        for(int i = 0; i<50000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
