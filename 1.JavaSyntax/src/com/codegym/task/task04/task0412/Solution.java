package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sNum = bufferedReader.readLine();
        int nNum = Integer.parseInt(sNum);

        if (nNum > 0)
            nNum = nNum*2;
        else if (nNum < 0)
            nNum = nNum+1;
        else
            nNum = 0;
        System.out.println(nNum);
    }

}