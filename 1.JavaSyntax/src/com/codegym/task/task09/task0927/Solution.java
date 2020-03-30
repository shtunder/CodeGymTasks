package com.codegym.task.task09.task0927;

import java.util.*;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        Map<String, Cat> map = new HashMap<>();
        String s;
        for (int i = 0; i < 10; i++){
            s = "number" + i;
            map.put(s, new Cat(s));
        }
//        Cat cat1 = new Cat("First");
//        Cat cat2 = new Cat("Second");
//        Cat cat3 = new Cat("Third");
//        Cat cat4 = new Cat("Fourth");
//        Cat cat5 = new Cat("Fifth");
//        Cat cat6 = new Cat("Sixth");
//        Cat cat7 = new Cat("Seventh");
//        Cat cat8 = new Cat("Eighth");
//        Cat cat9 = new Cat("Ninth");
//        Cat cat10 = new Cat("Tenth");
//        map.put(cat1.name, cat1);
//        map.put(cat2.name, cat2);
//        map.put(cat3.name, cat3);
//        map.put(cat4.name, cat4);
//        map.put(cat5.name, cat5);
//        map.put(cat6.name, cat6);
//        map.put(cat7.name, cat7);
//        map.put(cat8.name, cat8);
//        map.put(cat9.name, cat9);
//        map.put(cat10.name, cat10);
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
//        Set<Cat> set = new HashSet<>();
//        set.add(map.get("First"));
//        set.add(map.get("Second"));
//        set.add(map.get("Third"));
//        set.add(map.get("Fourth"));
//        set.add(map.get("Fifth"));
//        set.add(map.get("Sixth"));
//        set.add(map.get("Seventh"));
//        set.add(map.get("Eighth"));
//        set.add(map.get("Ninth"));
//        set.add(map.get("Tenth"));
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
