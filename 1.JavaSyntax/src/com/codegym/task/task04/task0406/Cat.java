package com.codegym.task.task04.task0406;

/* 
Name register

*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        //write your code here
        this.fullName = fullName;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Kitty", "Kit");
        System.out.println(cat.fullName);
    }
}
