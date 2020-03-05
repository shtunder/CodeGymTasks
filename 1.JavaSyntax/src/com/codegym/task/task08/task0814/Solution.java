package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(12);
        set.add(6);
        set.add(16);
        set.add(13);
        set.add(9);
        set.add(3);
        set.add(14);
        set.add(34);
        set.add(8);
        set.add(11);
        set.add(7);
        set.add(4);
        set.add(54);
        set.add(46);
        set.add(2);
        set.add(23);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if (number.compareTo(10)>0){
                iterator.remove();
            }
        }
        return set;

    }

    public static void main(String[] args) {

        HashSet<Integer> hashSet = createSet();
        HashSet<Integer> hashSet1 = removeAllNumbersGreaterThan10(hashSet);
        for (Integer a : hashSet) {
            System.out.println(a);
        }


    }
}
