package com.codegym.task.task06.task0608;

/* 
Static methods for cats

*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        //write your code here
        return Cat.catCount;
    }

    public static void setCatCount(int catCount) {
        //write your code here
        Cat.catCount = catCount;

    }

    public static void main(String[] args) {

    }
}
