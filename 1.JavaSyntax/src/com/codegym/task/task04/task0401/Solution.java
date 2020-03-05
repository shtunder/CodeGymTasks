package com.codegym.task.task04.task0401;

/* 
This age doesn't work for me…

*/
public class Solution {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("The age in adjustAge() is " + this.age);
        }
    }
}
