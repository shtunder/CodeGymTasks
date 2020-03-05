package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    //write your code here
    private String name = null;
    private int age;
    private int weight;
    private String color;
    private String address = null;

    public void initialize(String name){
        this.name = name;
        this.age = 5;
        this.weight = 10;
        this.color = "grey";
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "grey";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color = "grey";
    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 5;
    }

    public static void main(String[] args) {

    }
}
