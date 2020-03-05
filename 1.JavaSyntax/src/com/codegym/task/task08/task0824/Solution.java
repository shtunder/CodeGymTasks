package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Human child1 = new Human("Apple", true, 3, null);
        Human child2 = new Human("Pear", true, 2, null);
        Human child3 = new Human("Pumpkin", true, 1, null);
        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human mother = new Human("Mother", false, 10, children);
        Human father = new Human("Father", true, 15, children);
        ArrayList<Human> parents1 = new ArrayList<>();
        parents1.add(father);

        ArrayList<Human> parents2 = new ArrayList<>();
        parents2.add(mother);

        Human grandfather1 = new Human("Grandfather1", true, 30, parents1);
        Human grandmather1 = new Human("Grandmother1", false, 20, parents1);
        Human grandfather2 = new Human("Grandfather2", true, 35, parents2);
        Human grandmather2 = new Human("Grandmother2", false, 25, parents2);

        System.out.println(grandfather1);
        System.out.println(grandmather1);
        System.out.println(grandfather2);
        System.out.println(grandmather2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        //write your code here
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.children == null)
                return text;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
