package com.codegym.task.task04.task0404;

/* 
Cat register

*/

public class Cat {
    private static int catCount = 0;

    public static void addNewCat() {
        //write your code here
      Cat.catCount++;
    }

    public static void main(String[] args) {
        Cat.addNewCat();
        Cat.addNewCat();
        System.out.println(Cat.catCount);
    }
}
