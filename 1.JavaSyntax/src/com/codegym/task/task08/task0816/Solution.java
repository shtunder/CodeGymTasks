package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //write your code here
        map.put("Andrey", df.parse("June 11 1996"));
        map.put("Sasha", df.parse("December 12 2000"));
        map.put("Jan", df.parse("February 10 1992"));
        map.put("Galina", df.parse("May 10 1970"));
        map.put("Anatoliy", df.parse("April 26 2005"));
        map.put("Arseniy", df.parse("November 16 2002"));
        map.put("Petr", df.parse("September 1 1964"));
        map.put("Anis", df.parse("October 21 1999"));
        map.put("Yura", df.parse("August 14 2000"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //write your code here

        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() >= 5 && pair.getValue().getMonth() <= 7) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> hm = createMap();
        removeAllSummerPeople(hm);
        for (String s : hm.keySet()) {
            System.out.println(s);
        }
    }
}
