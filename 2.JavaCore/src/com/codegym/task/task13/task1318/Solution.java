package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws Exception  {
        // write your code here
        InputStream inputStream = null;
        BufferedReader reader = null;
        BufferedInputStream buffer = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();

            inputStream = new FileInputStream(s);
            buffer = new BufferedInputStream(inputStream);
            while (buffer.available() > 0) {
                char c = (char) buffer.read();
                System.out.print(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            reader.close();
            buffer.close();
        }
    }
}