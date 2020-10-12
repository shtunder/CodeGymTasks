package com.codegym.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Ivanov Ivan", new Date()));  // id=0
        allPeople.add(Person.createMale("Petrov Petr", new Date()));  // id=1
    }

    public static void main(String[] args) {
        //start here
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        //create person
        if (args[0].startsWith("-c")) {
            Date date = null;
            try {
                date = dateFormat.parse(args[3]);
            } catch (ParseException e) {
                e.getMessage();
            }

            if (args[2].startsWith("m")) {
                Person person = Person.createMale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            } else {
                Person person = Person.createFemale(args[1], date);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            }
        }

        //update person
        if (args[0].startsWith("-u")) {
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);

            //update name
            person.setName(args[2]);

            //update date
            Date date = null;
            try {
                date = dateFormat.parse(args[4]);
            } catch (ParseException e) {
                e.getMessage();
            }
            person.setBirthDay(date);

            //update sex
            if (args[3].startsWith("m"))
                person.setSex(Sex.MALE);
            else
                person.setSex(Sex.FEMALE);
        }

        //remove person
        if (args[0].startsWith("-d")) {
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);

            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        }

        //print person
        if (args[0].startsWith("-i")) {
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            StringBuffer s = new StringBuffer();
            s.append(person.getName());
            s.append(" ");
            s.append(person.getSex() == Sex.MALE ? "m" : "w");
            s.append(" ");
            s.append(dateFormatPrt.format(person.getBirthDay()));
            System.out.println(s);
        }
    }
}
