package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println(list.size());

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
