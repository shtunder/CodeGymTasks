package com.codegym.task.task05.task0505;

/* 
Feline carnage

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat alex = new Cat("Al",18,68,40);
        Cat andrey = new Cat("An",23,70,45);
        Cat arseniy = new Cat("Ars",16,67,43);
        System.out.println(alex.fight(andrey));
        System.out.println(alex.fight(arseniy));
        System.out.println(andrey.fight(arseniy));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
