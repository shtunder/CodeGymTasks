package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        //write your code here
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        HashSet<Dog> dogs = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            dogs.add(new Dog());
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        HashSet<Object> result = new HashSet<Object>();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        Iterator<Object> itr = pets.iterator();
        while (itr.hasNext()) {
            Object pet = itr.next();
            System.out.println(pet);
        }
    }

    //write your code here
    public static class Cat {

    }

    public static class Dog {

    }
}
