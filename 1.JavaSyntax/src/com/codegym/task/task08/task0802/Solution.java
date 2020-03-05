package com.codegym.task.task08.task0802;

/* 
HashMap of 10 pairs

*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Map<String, String> map = new HashMap<String, String>();
        map.put("watermelon", "melon");
        map.put("banana", "fruit");
        map.put("cherry", "fruit");
        map.put("pear", "fruit");
        map.put("cantaloupe", "melon");
        map.put("blackberry", "fruit");
        map.put("ginseng", "root");
        map.put("strawberry", "fruit");
        map.put("iris", "flower");
        map.put("potato", "tuber");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }

    }
}
