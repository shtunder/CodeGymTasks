package com.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
We don't need repeats

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
        map.put("Lenova", "Kate");
        map.put("Diachenko", "Alexander");
        map.put("Petrova", "Alena");

        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here
        Map<String,String> hm = new HashMap<>(map);
        for (String s: hm.values()){
            int count =0;
            for (String i:hm.values()) {
                if (i.equals(s)){
                    count++;
                }
                if(count==2){
                        removeItemFromMapByValue(map, s);
                }
            }
        }

//        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
//
//        while(iterator.hasNext()){
//            Map.Entry<String,String> pair = iterator.next();
//            String value = pair.getValue();
//            removeItemFromMapByValue(map,value);
//        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        Map<String, String> hm = createMap();
        removeFirstNameDuplicates(hm);
        for (String s : hm.values()){
            System.out.println(s);
        }
    }
}

