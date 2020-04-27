package com.codegym.task.task13.task1324;

import java.awt.*;

/* 
One method in a class

*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
