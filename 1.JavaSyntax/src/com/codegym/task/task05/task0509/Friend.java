package com.codegym.task.task05.task0509;

/* 
Create a Friend class

*/

public class Friend {
    //write your code here
    private String name;
    private int age;
    private char sex;

    public void initialize(String name){
        this.name = name;
        this.age = 0;
        this.sex = 'M';
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.sex = 'M';
    }

    public void initialize(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
