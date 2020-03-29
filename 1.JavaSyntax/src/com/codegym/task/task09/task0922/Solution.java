package com.codegym.task.task09.task0922;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        //2013-08-18
        //AUG 18, 2013
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat ft2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        try {
            Date parseDate;
            parseDate = ft1.parse(s);
            String dateToStr = ft2.format(parseDate);
            System.out.println(dateToStr.toUpperCase());
        } catch (ParseException e) {
            System.out.println("Не удалось распарсить строку с помощью " + ft1);
        }
    }
}
