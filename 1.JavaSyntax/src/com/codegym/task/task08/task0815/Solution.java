package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("Shtunder", "Andrey");
        map.put("Ivanov", "Alexander");
        map.put("Deribina", "Kate");
        map.put("Petevka", "Yura");
        map.put("Micheleva", "Alena");
        map.put("Nasretdinov", "Anis");
        map.put("Schick", "Andrey");
        map.put("Lenov", "Kate");
        map.put("Diachenko", "Alexander");
        map.put("Petrova", "Alena");

        return map;

    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        int count = 0;
        for (String i : map.values()) {
            if (i.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        int count = 0;
        for (String i : map.keySet()){
            if(i.equals(lastName)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        HashMap<String,String> hm = createMap();
//        System.out.println(getSameFirstNameCount(hm,"Andrey"));
//        System.out.println(getSameLastNameCount(hm, "Shtunder"));

    }
}
