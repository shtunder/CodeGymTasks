package com.codegym.task.task12.task1225;

/* 
Visitors

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //write your code here



        if (o instanceof Tiger)
            return "Tiger";
        if (o instanceof Lion)
            return "Lion";
        if (o instanceof Cat)
            return "Cat";
        if (o instanceof Cow)
            return "Cow";
        if (o instanceof Bull)
            return "Bull";
        return "Animal";
    }

    public static class Cat extends Animal   // <-- Class inheritance!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
