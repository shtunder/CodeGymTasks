package com.codegym.task.task08.task0819;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        Iterator<Cat> itr = cats.iterator();
        cats.remove(itr.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for(Cat cat:cats){
            System.out.println(cat);
        }
//        Iterator<Cat> iterator = cats.iterator();
//        while (iterator.hasNext()){
//            Cat cat = iterator.next();
//            System.out.println(cat);
//        }
    }

    // step 1
    public static class Cat {
    }
}
