package com.codegym.task.task04.task0441;


/* 
Somehow average

*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if ((a>=b && a<=c) || (a>=c && a<=b)){
            System.out.println(a);
        }
        else if ((b>=a && b<=c) || (b>=c && b<=a)){
            System.out.println(b);
        }
        else if ((c>=a && c<=b) || (c>=b && c<=a)){
            System.out.println(c);
        }

    }
}
