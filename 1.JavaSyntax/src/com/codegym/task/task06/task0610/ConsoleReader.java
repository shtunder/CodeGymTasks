package com.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
ConsoleReader class

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        return s;
    }

    public static int readInt() throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        return a;
    }

    public static double readDouble() throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Double b = Double.parseDouble(bufferedReader.readLine());
        return b;
    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean c = Boolean.parseBoolean(bufferedReader.readLine());
        return c;
    }

    public static void main(String[] args){

    }
}
