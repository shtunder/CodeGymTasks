package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here
    private String name = null;
    private int age =  3;
    private int weight = 5;
    private String address = null;
    private String color = "black";

    public Cat(String name){
        this.name = name;
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
