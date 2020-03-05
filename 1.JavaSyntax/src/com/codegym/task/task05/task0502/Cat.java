package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        if (this.age*this.weight*this.strength>anotherCat.age*anotherCat.weight*anotherCat.strength){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 4;
        cat1.weight = 10;
        cat1.strength = 2;
        Cat cat2 = new Cat();
        cat2.age = 4;
        cat2.weight = 10;
        cat2.strength = 3;

        System.out.println(cat2.fight(cat1));

    }
}
