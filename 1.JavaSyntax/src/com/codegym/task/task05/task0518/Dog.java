package com.codegym.task.task05.task0518;

/* 
Dog registration

*/


public class Dog {
    //write your code here
    private String name = null;
    private int age = 0;
    private String color = "black";

    public Dog(String name){
        this.name = name;
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
