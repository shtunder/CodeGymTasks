package com.codegym.task.task04.task0443;


/* 
A name is a name

*/



import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        method();
    }

    public static void method () throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int dd = Integer.parseInt(bufferedReader.readLine());
        int mm = Integer.parseInt(bufferedReader.readLine());
        int yyyy = Integer.parseInt(bufferedReader.readLine());

        System.out.println("My name is " + name + ".");
        System.out.println("I was born on " + dd + "/" + mm + "/" + yyyy);

    }
}
