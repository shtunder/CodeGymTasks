package com.codegym.task.task19.task1904;

import java.util.Date;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private Date birthDate;

    public Person(String lastName, String firstName, String middleName, Date birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", firstName, middleName, lastName, birthDate.toString());
    }
}
