package com.codegym.task.task20.task2020;

import java.io.PrintStream;
import java.util.logging.Logger;

/* 
Serializing people

*/

public class Solution {

    public static class Person {
        String firstName;
        String lastName;
        String fullName;
        final String greeting;
        String country;
        Sex sex;
        PrintStream outputStream;
        Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {

    }
}
