package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        Human gFather1 = new Human("Sasha", true, 77);
        Human gMother1 = new Human("Valya", false, 78);
        Human gFather2 = new Human("Fedor", true, 79);
        Human gMother2 = new Human("Maria", false,81);
        Human father = new Human("Anatoliy", true, 55, gFather1, gMother1);
        Human mother = new Human("Galina", false,49, gFather2, gMother2);
        Human son1 = new Human("Yan", true,27, father, mother);
        Human son2 = new Human("Andrey", true,23, father, mother);
        Human son3 = new Human("Sasha", true, 19, father, mother);
        System.out.println(gFather1);
        System.out.println(gMother1);
        System.out.println(gFather2);
        System.out.println(gMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);

    }

    public static class Human {
        // write your code here
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}