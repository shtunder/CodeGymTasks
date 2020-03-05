package com.codegym.task.task04.task0403;

/* 
What's the cat's name?

*/

public class Cat {
    private String name = "nameless cat";

    public void setName(String name) {
        //write your code here
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Simba");
        System.out.println(cat.name);
    }
}
