package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String name;
        private String surname;
        private int age;
        private char sex;
        private int yearOfBirth;
        private int monthOfBirth;

        public Human() {
            this.name = "";
            this.surname = "";
            this.age = 0;
            this.sex = 'M';
            this.yearOfBirth = 1970;
            this.monthOfBirth = 0;
        }

        public Human(String name, String surname, int age, char sex, int yearOfBirth, int monthOfBirth){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.yearOfBirth = yearOfBirth;
            this.monthOfBirth = monthOfBirth;
        }

        public Human(String name, String surname, int age, char sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.yearOfBirth = 1970;
            this.monthOfBirth = 0;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = 'M';
            this.yearOfBirth = 1970;
            this.monthOfBirth = 0;
        }

        public Human(String name) {
            this.name = name;
            this.surname = "";
            this.age = 0;
            this.sex = 'M';
            this.yearOfBirth = 1970;
            this.monthOfBirth = 0;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
            this.age = 0;
            this.sex = 'M';
            this.yearOfBirth = 1970;
            this.monthOfBirth = 0;
        }

        public Human(String name, String surname, int yearOfBirth, int monthOfBirth) {
            this.name = name;
            this.surname = surname;
            this.age = 0;
            this.sex = 'M';
            this.yearOfBirth = yearOfBirth;
            this.monthOfBirth = monthOfBirth;
        }

        public Human(String name, String surname, char sex) {
            this.name = name;
            this.surname = surname;
            this.age = 0;
            this.sex = sex;
            this.yearOfBirth = 1970;
            this.monthOfBirth = 0;
        }

        public Human(Human hm){
            this.name = hm.name;
            this.surname = hm.surname;
            this.age = hm.age;
            this.sex = hm.sex;
            this.yearOfBirth = hm.yearOfBirth;
            this.monthOfBirth = hm.monthOfBirth;
        }

        public Human(Human hm, String name, String surname){
            this.name = name;
            this.surname = surname;
            this.age = hm.age;
            this.sex = hm.sex;
            this.yearOfBirth = hm.yearOfBirth;
            this.monthOfBirth = hm.monthOfBirth;
        }

    }
}
