package com.codegym.task.task15.task1521;

import java.math.BigDecimal;

/* 
OOP: Method overloading

*/

public class Solution {
    public static void main(String[] args) {
        // Block 2.
        // Call for Objects
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        // Block 3.
        // Call for Numbers
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        // Block 4.
        // Call for Strings
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
