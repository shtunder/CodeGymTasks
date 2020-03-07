package com.codegym.task.task09.task0911;

import java.util.HashMap;

/* 
Exception when working with Map collections

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e){
            System.out.println("NullPointerException has been caught");
        }

        //write your code here
    }
}
