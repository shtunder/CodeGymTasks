package com.codegym.task.task08.task0827;


import java.util.Date;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 30 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date d = new Date(date);
//        Date yearStartTime = new Date();
//        yearStartTime.setHours(0);
//        yearStartTime.setMinutes(0);
//        yearStartTime.setSeconds(0);
//        yearStartTime.setDate(1);
//        yearStartTime.setMonth(0);
//        long msTimeDifference = d.getTime() - yearStartTime.getTime();
//        long msDay = 24 * 60 * 60 * 1000;
//        int dayCount = (int) (msTimeDifference / msDay);
//        if (dayCount % 2 == 1) {
//            return true;
//        }
//        return false;
        if (d.getDate() % 2 == 1) {
            return true;
        }
        return false;
    }
}