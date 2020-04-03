package com.codegym.task.task10.task1011;

/* 
Big salary

*/

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";

//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length - 5; i++){
//            for (int j = i; j < chars.length; j++) {
//                System.out.print(chars[j]);
//            }
//            System.out.println();
//        }

        StringBuilder sBuilder = new StringBuilder(s);
        for (int i = 0; i < sBuilder.length()-5; i++){
            System.out.println(sBuilder.substring(i));
        }

    }

}

