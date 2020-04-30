package com.codegym.task.task13.task1327;

public class Person implements TurnipItem {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void pull(Person second) {
        System.out.println(name + " behind " + second.getName());
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}