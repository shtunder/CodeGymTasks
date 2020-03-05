package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //write your code here
        Map<String,String> map = new HashMap<>();
        map.put("Shtunder","Andrey");
        map.put("Nator","Paul");
        map.put("Mahe","Sasha");
        map.put("Lepot","Peter");
        map.put("Shtunder","Arseniy");
        map.put("Metop","Sasha");
        map.put("Yoer","Yan");
        map.put("Letu","Anatoliy");
        map.put("Aote","Sasha");
        map.put("Joret","Irene");


        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
