package com.codegym.task.task15.task1529;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //write your code here
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if (s.equals("helicopter")) {
                result = new Helicopter();
            }
            if (s.equals("plane")) {
                int number = Integer.parseInt(reader.readLine());
                result = new Plane(number);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
