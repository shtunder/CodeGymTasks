package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println(name + " will take over the world in " + nAge + " years. Mwa-ha-ha!");
    }
}
