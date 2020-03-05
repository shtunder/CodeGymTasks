package com.codegym.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;

/* 
HashMap of Objects

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //write your code here
        for (Map.Entry<String, Object> pair : map.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
