package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man man1 = new Man("Andrey",23,"Sucharevskaya");
        Man man2 = new Man("Sasha",18,"Esenina");
        Woman woman1 = new Woman("Angela",21,"Rafieva");
        Woman woman2 = new Woman("Irene", 19,"Cubicheva");
        System.out.println(man1.name+" "+man1.age+" "+man1.address);
        System.out.println(man2.name+" "+man2.age+" "+ man2.address);
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address);
    }

    //write your code here
    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man() {
        }

        public Man(int age) {
            this.age = age;
        }

        public Man(String name) {
            this.name = name;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman() {
        }

        public Woman(String name) {
            this.name = name;
        }

        public Woman(int age) {
            this.age = age;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}