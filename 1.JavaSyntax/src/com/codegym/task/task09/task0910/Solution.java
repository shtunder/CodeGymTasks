package com.codegym.task.task09.task0910;

import java.util.ArrayList;

/* 
Exception when working with List collections

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException has been caught");
        }

        //write your code here
    }
}