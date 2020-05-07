package com.codegym.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* 
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        //write your code here
        try {
            String s = null;
            s.trim();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[10];
            array[10] = 1;
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Object o = new Integer(10);
            System.out.println((String) o);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            String s = "Hello!";
            int a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            FileInputStream inputStream = new FileInputStream("bad_file.txt");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            int[] array = new int[-10];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            Object[] objects = new String[10];
            objects[0] = 10;
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            Object o = new String("Andrey");
            System.out.println((Integer)o);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            String s="";
            s.charAt(10);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

    }

}
