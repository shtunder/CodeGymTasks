package com.codegym.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {

            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String str = fileScanner.nextLine();
            String[] words = str.split(" ");

            Calendar calendar = new GregorianCalendar(Integer.parseInt(words[5]), Integer.parseInt(words[3]) - 1, Integer.parseInt(words[4]));
            Date date = calendar.getTime();

//            String strDate = words[3] + " " + words[4] + " " + words[5];
//            SimpleDateFormat formatter = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
//            Date date = null;
//            try {
//                date = formatter.parse(strDate);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }

            return new Person(words[2], words[0], words[1], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
