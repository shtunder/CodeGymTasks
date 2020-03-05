package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ams", 180);
        map.put("Nhe", 560);
        map.put("Mwu", 900);
        map.put("Ago", 450);
        map.put("Hto", 290);
        map.put("Ber", 700);
        map.put("Wer", 510);
        map.put("Vat", 340);
        map.put("Cab", 540);
        map.put("Yel", 910);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        HashMap<String, Integer> hm = new HashMap<>(map);
        Iterator<Map.Entry<String, Integer>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}