package com.codegym.task.task09.task0913;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
Exceptions. Just exceptions.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        try {
            method1();
        } catch (NullPointerException e){
            System.out.println("NullPointerException has been caught");
        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException has been caught");
        }

        //write your code here
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}
