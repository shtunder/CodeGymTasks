package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Set<String> set = new HashSet<String>();
        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("cantaloupe");
        set.add("blackberry");
        set.add("ginseng");
        set.add("strawberry");
        set.add("iris");
        set.add("potato");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }

    }
}
